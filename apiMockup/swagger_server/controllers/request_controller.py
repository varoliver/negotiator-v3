import connexion
import six

from swagger_server.models.inline_response200 import InlineResponse200  # noqa: E501
from swagger_server.models.io_export_body import IoExportBody  # noqa: E501
from swagger_server.models.request import Request  # noqa: E501
from swagger_server import util


def v2_io_export_get(body):  # noqa: E501
    """Get request details by requestId

    Get detailed data for a request by requestId # noqa: E501

    :param body: 
    :type body: dict | bytes

    :rtype: Request
    """
    if connexion.request.is_json:
        body = IoExportBody.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def v2_io_import_post(body):  # noqa: E501
    """Import a request to negotiator

    Import a request to negotiator # noqa: E501

    :param body: 
    :type body: dict | bytes

    :rtype: InlineResponse200
    """
    if connexion.request.is_json:
        body = Request.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
