# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from swagger_server.test import BaseTestCase


class TestListController(BaseTestCase):
    """ListController integration test stubs"""

    def test_v2_list_get(self):
        """Test case for v2_list_get

        List of Biobanks and Collections in all directories
        """
        response = self.client.open(
            '/v2/list',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
