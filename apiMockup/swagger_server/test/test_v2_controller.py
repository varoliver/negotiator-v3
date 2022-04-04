# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from swagger_server.models.query import Query  # noqa: E501
from swagger_server.models.query_create_response import QueryCreateResponse  # noqa: E501
from swagger_server.models.status import Status  # noqa: E501
from swagger_server.test import BaseTestCase


class TestV2Controller(BaseTestCase):
    """V2Controller integration test stubs"""

    def test_directory_create_query_post(self):
        """Test case for directory_create_query_post

        Creates a new query.
        """
        body = Query()
        response = self.client.open(
            '/directory/create_query',
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_status_get(self):
        """Test case for status_get

        Get version and statistics of the called Negotiator instance.
        """
        response = self.client.open(
            '/status',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
