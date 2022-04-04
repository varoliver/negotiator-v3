import connexion
import six

from swagger_server.models.data_source import DataSource  # noqa: E501
from swagger_server.models.error_response import ErrorResponse  # noqa: E501
from swagger_server.models.project_create_response_v3 import ProjectCreateResponseV3  # noqa: E501
from swagger_server.models.project_create_v3 import ProjectCreateV3  # noqa: E501
from swagger_server.models.query_create_v3 import QueryCreateV3  # noqa: E501
from swagger_server.models.query_response_v3 import QueryResponseV3  # noqa: E501
from swagger_server.models.request_create_v3 import RequestCreateV3  # noqa: E501
from swagger_server.models.request_response_v3 import RequestResponseV3  # noqa: E501
from swagger_server.models.user_v3 import UserV3  # noqa: E501
from swagger_server import util


def v3_data_sources_data_source_id_get(data_source_id):  # noqa: E501
    """Retrieves data of a data source

    Retrieves data of the data source identified by data-source-id # noqa: E501

    :param data_source_id: the id of the data source to retrieve
    :type data_source_id: str

    :rtype: DataSource
    """
    return 'do some magic!'


def v3_data_sources_get():  # noqa: E501
    """Gets the list of data sources registered in this Negotiator

     # noqa: E501


    :rtype: List[DataSource]
    """
    return 'do some magic!'


def v3_projects_get(user=None):  # noqa: E501
    """Get the list of projects

    Get the list of projects. It is possible to filter by user id # noqa: E501

    :param user: the id of the user used to filter the projects
    :type user: int

    :rtype: ProjectCreateResponseV3
    """
    return 'do some magic!'


def v3_projects_post(body, prefer=None):  # noqa: E501
    """Create a new project in the negotiator

    Create a new project in the negotiator # noqa: E501

    :param body: 
    :type body: dict | bytes
    :param prefer: specifies whether to return all data of the created project or just the id. By default just the id is returned
    :type prefer: str

    :rtype: ProjectCreateResponseV3
    """
    if connexion.request.is_json:
        body = ProjectCreateV3.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def v3_projects_project_id_get(project_id):  # noqa: E501
    """Retrieve a project in the negotiator by Id

    Retrieve a project in the negotiator by Id # noqa: E501

    :param project_id: Id of project to return
    :type project_id: int

    :rtype: ProjectCreateResponseV3
    """
    return 'do some magic!'


def v3_projects_project_id_put(body, project_id):  # noqa: E501
    """Update the project identified by Id

    Update the project identified by Id # noqa: E501

    :param body: 
    :type body: dict | bytes
    :param project_id: Id of project to return
    :type project_id: int

    :rtype: None
    """
    if connexion.request.is_json:
        body = ProjectCreateV3.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def v3_queries_post(body, prefer=None):  # noqa: E501
    """Creates a query for a Data Source

    Create a query for the data source identified by {dataSourceId} # noqa: E501

    :param body: 
    :type body: dict | bytes
    :param prefer: specifies whether to return all data of the created query or just the id. By default it just the id is returned
    :type prefer: str

    :rtype: QueryResponseV3
    """
    if connexion.request.is_json:
        body = QueryCreateV3.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def v3_queries_query_id_get(query_id):  # noqa: E501
    """Retrieves data of a specific query

     # noqa: E501

    :param query_id: the id of the query to retrieve
    :type query_id: str

    :rtype: QueryResponseV3
    """
    return 'do some magic!'


def v3_requests_post(body=None, prefer=None):  # noqa: E501
    """Creates a request

     # noqa: E501

    :param body: 
    :type body: dict | bytes
    :param prefer: specifies whether to return all data of the created request or just the id. By default it just the id is returned
    :type prefer: str

    :rtype: RequestResponseV3
    """
    if connexion.request.is_json:
        body = RequestCreateV3.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def v3_requests_request_id_get(request_id):  # noqa: E501
    """Retrieves the request with id {requestId}

     # noqa: E501

    :param request_id: The id of the request to get/update
    :type request_id: int

    :rtype: RequestResponseV3
    """
    return 'do some magic!'


def v3_requests_request_id_put(request_id, body=None):  # noqa: E501
    """Updates the request with id {requestId}

     # noqa: E501

    :param request_id: The id of the request to get/update
    :type request_id: int
    :param body: 
    :type body: dict | bytes

    :rtype: None
    """
    if connexion.request.is_json:
        body = RequestCreateV3.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def v3_users_get(project_id=None, request_id=None):  # noqa: E501
    """v3_users_get

    Endpoint used to search for users by some parameters ids # noqa: E501

    :param project_id: specifies the id of the project the users are involved in
    :type project_id: int
    :param request_id: specifies the id of the request the users are involved in
    :type request_id: int

    :rtype: List[UserV3]
    """
    return 'do some magic!'
