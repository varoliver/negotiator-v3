# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from swagger_server.models.aai_user_inner import AAIUserInner  # noqa: E501
from swagger_server.models.aai_user_mapping_inner import AAIUserMappingInner  # noqa: E501
from swagger_server.test import BaseTestCase


class TestPerunController(BaseTestCase):
    """PerunController integration test stubs"""

    def test_perun_mapping_post(self):
        """Test case for perun_mapping_post

        Update AAI user collection mapping
        """
        body = [AAIUserInner()]
        response = self.client.open(
            '/perun/mapping',
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_perun_networks_mapping_post(self):
        """Test case for perun_networks_mapping_post

        Update AAI user network mapping
        """
        body = [AAIUserInner()]
        response = self.client.open(
            '/perun/networks/mapping',
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_perun_networks_users_post(self):
        """Test case for perun_networks_users_post

        Update AAI user information for network users
        """
        body = [AAIUserMappingInner()]
        response = self.client.open(
            '/perun/networks/users',
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_perun_users_post(self):
        """Test case for perun_users_post

        Update AAI user information
        """
        body = [AAIUserInner()]
        response = self.client.open(
            '/perun/users',
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
