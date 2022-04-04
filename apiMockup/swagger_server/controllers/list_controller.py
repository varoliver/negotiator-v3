import connexion
import six

from swagger_server import util


def v2_list_get():  # noqa: E501
    """List of Biobanks and Collections in all directories

    Returns a JSON array with a hierarchical structure of all directories integrated into the \\Negotiator. For each directory all biobanks registered are listed with the identifying ID of the directory. In the biobank a list of all associated collections is listed. # noqa: E501


    :rtype: List
    """
    return 'do some magic!'
