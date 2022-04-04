import connexion
import six

from swagger_server.models.query import Query  # noqa: E501
from swagger_server.models.query_create_response import QueryCreateResponse  # noqa: E501
from swagger_server.models.status import Status  # noqa: E501
from swagger_server import util


def directory_create_query_post(body):  # noqa: E501
    """Creates a new query.

    Takes a JSON query object with information of the search criteria and results of the directory. Stores it temporary in the database and returns a redirect URL for the directory. With this URL the directory can redirect the user to the query edit page. I case of updating a existing query or extending an exiting request, a token is provided for identification. # noqa: E501

    :param body: 
    :type body: dict | bytes

    :rtype: QueryCreateResponse
    """
    if connexion.request.is_json:
        body = Query.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def status_get():  # noqa: E501
    """Get version and statistics of the called Negotiator instance.

    Listes depoyed version of the BBMRI-ERIC Negotiator service, basic statistic of the service. # noqa: E501


    :rtype: Status
    """
    return 'do some magic!'
