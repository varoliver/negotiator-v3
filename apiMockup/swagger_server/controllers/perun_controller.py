import connexion
import six

from swagger_server.models.aai_user_inner import AAIUserInner  # noqa: E501
from swagger_server.models.aai_user_mapping_inner import AAIUserMappingInner  # noqa: E501
from swagger_server import util


def perun_mapping_post(body):  # noqa: E501
    """Update AAI user collection mapping

    Update AAI user collections mapping # noqa: E501

    :param body: 
    :type body: list | bytes

    :rtype: None
    """
    if connexion.request.is_json:
        body = [AAIUserInner.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def perun_networks_mapping_post(body):  # noqa: E501
    """Update AAI user network mapping

    Update AAI user network mapping # noqa: E501

    :param body: 
    :type body: list | bytes

    :rtype: None
    """
    if connexion.request.is_json:
        body = [AAIUserInner.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def perun_networks_users_post(body):  # noqa: E501
    """Update AAI user information for network users

    Update AAI user information from networks # noqa: E501

    :param body: 
    :type body: list | bytes

    :rtype: None
    """
    if connexion.request.is_json:
        body = [AAIUserMappingInner.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def perun_users_post(body):  # noqa: E501
    """Update AAI user information

    Update AAI user information from biobanks and collections # noqa: E501

    :param body: 
    :type body: list | bytes

    :rtype: None
    """
    if connexion.request.is_json:
        body = [AAIUserInner.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'
