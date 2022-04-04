# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from swagger_server.models.data_source import DataSource  # noqa: E501
from swagger_server.models.error_response import ErrorResponse  # noqa: E501
from swagger_server.models.project_create_response_v3 import ProjectCreateResponseV3  # noqa: E501
from swagger_server.models.project_create_v3 import ProjectCreateV3  # noqa: E501
from swagger_server.models.query_create_v3 import QueryCreateV3  # noqa: E501
from swagger_server.models.query_response_v3 import QueryResponseV3  # noqa: E501
from swagger_server.models.request_create_v3 import RequestCreateV3  # noqa: E501
from swagger_server.models.request_response_v3 import RequestResponseV3  # noqa: E501
from swagger_server.models.user_v3 import UserV3  # noqa: E501
from swagger_server.test import BaseTestCase


class TestV3Controller(BaseTestCase):
    """V3Controller integration test stubs"""

    def test_v3_data_sources_data_source_id_get(self):
        """Test case for v3_data_sources_data_source_id_get

        Retrieves data of a data source
        """
        response = self.client.open(
            '/v3/data-sources/{dataSourceId}'.format(data_source_id='data_source_id_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_v3_data_sources_get(self):
        """Test case for v3_data_sources_get

        Gets the list of data sources registered in this Negotiator
        """
        response = self.client.open(
            '/v3/data-sources',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_v3_projects_get(self):
        """Test case for v3_projects_get

        Get the list of projects
        """
        query_string = [('user', 789)]
        response = self.client.open(
            '/v3/projects',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_v3_projects_post(self):
        """Test case for v3_projects_post

        Create a new project in the negotiator
        """
        body = ProjectCreateV3()
        headers = [('prefer', 'return=minimal')]
        response = self.client.open(
            '/v3/projects',
            method='POST',
            data=json.dumps(body),
            headers=headers,
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_v3_projects_project_id_get(self):
        """Test case for v3_projects_project_id_get

        Retrieve a project in the negotiator by Id
        """
        response = self.client.open(
            '/v3/projects/{projectId}'.format(project_id=789),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_v3_projects_project_id_put(self):
        """Test case for v3_projects_project_id_put

        Update the project identified by Id
        """
        body = ProjectCreateV3()
        response = self.client.open(
            '/v3/projects/{projectId}'.format(project_id=789),
            method='PUT',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_v3_queries_post(self):
        """Test case for v3_queries_post

        Creates a query for a Data Source
        """
        body = QueryCreateV3()
        headers = [('prefer', 'return=minimal')]
        response = self.client.open(
            '/v3/queries',
            method='POST',
            data=json.dumps(body),
            headers=headers,
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_v3_queries_query_id_get(self):
        """Test case for v3_queries_query_id_get

        Retrieves data of a specific query
        """
        response = self.client.open(
            '/v3/queries/{queryId}'.format(query_id='query_id_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_v3_requests_post(self):
        """Test case for v3_requests_post

        Creates a request
        """
        body = RequestCreateV3()
        headers = [('prefer', 'return=minimal')]
        response = self.client.open(
            '/v3/requests',
            method='POST',
            data=json.dumps(body),
            headers=headers,
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_v3_requests_request_id_get(self):
        """Test case for v3_requests_request_id_get

        Retrieves the request with id {requestId}
        """
        response = self.client.open(
            '/v3/requests/{requestId}'.format(request_id=789),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_v3_requests_request_id_put(self):
        """Test case for v3_requests_request_id_put

        Updates the request with id {requestId}
        """
        body = RequestCreateV3()
        response = self.client.open(
            '/v3/requests/{requestId}'.format(request_id=789),
            method='PUT',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_v3_users_get(self):
        """Test case for v3_users_get

        
        """
        query_string = [('project_id', 789),
                        ('request_id', 789)]
        response = self.client.open(
            '/v3/users/',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
