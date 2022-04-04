# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from swagger_server.models.inline_response200 import InlineResponse200  # noqa: E501
from swagger_server.models.io_export_body import IoExportBody  # noqa: E501
from swagger_server.models.request import Request  # noqa: E501
from swagger_server.test import BaseTestCase


class TestRequestController(BaseTestCase):
    """RequestController integration test stubs"""

    def test_v2_io_export_get(self):
        """Test case for v2_io_export_get

        Get request details by requestId
        """
        body = IoExportBody()
        response = self.client.open(
            '/v2/io/export',
            method='GET',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_v2_io_import_post(self):
        """Test case for v2_io_import_post

        Import a request to negotiator
        """
        body = Request()
        response = self.client.open(
            '/v2/io/import',
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
