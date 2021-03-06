# coding: utf-8

"""
Licensed to Cloudera, Inc. under one
or more contributor license agreements.  See the NOTICE file
distributed with this work for additional information
regarding copyright ownership.  Cloudera, Inc. licenses this file
to you under the Apache License, Version 2.0 (the
"License"); you may not use this file except in compliance
with the License.  You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
"""


import pprint
import re  # noqa: F401

import six


class NormalizationConfiguration(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    """
    Attributes:
      swagger_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    swagger_types = {
        'increase_max_number_of_open_files': 'bool',
        'install_packages': 'bool',
        'minimize_swappiness': 'bool',
        'miscellaneous_service_adjustment': 'bool',
        'mount_all_unmounted_disks': 'bool',
        'prewarm_directory': 'bool',
        'resize_root_partition': 'bool'
    }

    attribute_map = {
        'increase_max_number_of_open_files': 'increaseMaxNumberOfOpenFiles',
        'install_packages': 'installPackages',
        'minimize_swappiness': 'minimizeSwappiness',
        'miscellaneous_service_adjustment': 'miscellaneousServiceAdjustment',
        'mount_all_unmounted_disks': 'mountAllUnmountedDisks',
        'prewarm_directory': 'prewarmDirectory',
        'resize_root_partition': 'resizeRootPartition'
    }

    def __init__(self, increase_max_number_of_open_files=None, install_packages=None, minimize_swappiness=None, miscellaneous_service_adjustment=None, mount_all_unmounted_disks=None, prewarm_directory=None, resize_root_partition=None):  # noqa: E501
        """NormalizationConfiguration - a model defined in Swagger"""  # noqa: E501

        self._increase_max_number_of_open_files = None
        self._install_packages = None
        self._minimize_swappiness = None
        self._miscellaneous_service_adjustment = None
        self._mount_all_unmounted_disks = None
        self._prewarm_directory = None
        self._resize_root_partition = None
        self.discriminator = None

        if increase_max_number_of_open_files is not None:
            self.increase_max_number_of_open_files = increase_max_number_of_open_files
        if install_packages is not None:
            self.install_packages = install_packages
        if minimize_swappiness is not None:
            self.minimize_swappiness = minimize_swappiness
        if miscellaneous_service_adjustment is not None:
            self.miscellaneous_service_adjustment = miscellaneous_service_adjustment
        if mount_all_unmounted_disks is not None:
            self.mount_all_unmounted_disks = mount_all_unmounted_disks
        if prewarm_directory is not None:
            self.prewarm_directory = prewarm_directory
        if resize_root_partition is not None:
            self.resize_root_partition = resize_root_partition

    @property
    def increase_max_number_of_open_files(self):
        """Gets the increase_max_number_of_open_files of this NormalizationConfiguration.  # noqa: E501

        Whether the max number of files should be increased during normalization  # noqa: E501

        :return: The increase_max_number_of_open_files of this NormalizationConfiguration.  # noqa: E501
        :rtype: bool
        """
        return self._increase_max_number_of_open_files

    @increase_max_number_of_open_files.setter
    def increase_max_number_of_open_files(self, increase_max_number_of_open_files):
        """Sets the increase_max_number_of_open_files of this NormalizationConfiguration.

        Whether the max number of files should be increased during normalization  # noqa: E501

        :param increase_max_number_of_open_files: The increase_max_number_of_open_files of this NormalizationConfiguration.  # noqa: E501
        :type: bool
        """

        self._increase_max_number_of_open_files = increase_max_number_of_open_files

    @property
    def install_packages(self):
        """Gets the install_packages of this NormalizationConfiguration.  # noqa: E501

        Whether packages should be installed during normalization  # noqa: E501

        :return: The install_packages of this NormalizationConfiguration.  # noqa: E501
        :rtype: bool
        """
        return self._install_packages

    @install_packages.setter
    def install_packages(self, install_packages):
        """Sets the install_packages of this NormalizationConfiguration.

        Whether packages should be installed during normalization  # noqa: E501

        :param install_packages: The install_packages of this NormalizationConfiguration.  # noqa: E501
        :type: bool
        """

        self._install_packages = install_packages

    @property
    def minimize_swappiness(self):
        """Gets the minimize_swappiness of this NormalizationConfiguration.  # noqa: E501

        Whether swappiness should be minimized during normalization  # noqa: E501

        :return: The minimize_swappiness of this NormalizationConfiguration.  # noqa: E501
        :rtype: bool
        """
        return self._minimize_swappiness

    @minimize_swappiness.setter
    def minimize_swappiness(self, minimize_swappiness):
        """Sets the minimize_swappiness of this NormalizationConfiguration.

        Whether swappiness should be minimized during normalization  # noqa: E501

        :param minimize_swappiness: The minimize_swappiness of this NormalizationConfiguration.  # noqa: E501
        :type: bool
        """

        self._minimize_swappiness = minimize_swappiness

    @property
    def miscellaneous_service_adjustment(self):
        """Gets the miscellaneous_service_adjustment of this NormalizationConfiguration.  # noqa: E501

        Whether services should be adjusted during normalization  # noqa: E501

        :return: The miscellaneous_service_adjustment of this NormalizationConfiguration.  # noqa: E501
        :rtype: bool
        """
        return self._miscellaneous_service_adjustment

    @miscellaneous_service_adjustment.setter
    def miscellaneous_service_adjustment(self, miscellaneous_service_adjustment):
        """Sets the miscellaneous_service_adjustment of this NormalizationConfiguration.

        Whether services should be adjusted during normalization  # noqa: E501

        :param miscellaneous_service_adjustment: The miscellaneous_service_adjustment of this NormalizationConfiguration.  # noqa: E501
        :type: bool
        """

        self._miscellaneous_service_adjustment = miscellaneous_service_adjustment

    @property
    def mount_all_unmounted_disks(self):
        """Gets the mount_all_unmounted_disks of this NormalizationConfiguration.  # noqa: E501

        Whether unmounted disks should be mounted during normalization  # noqa: E501

        :return: The mount_all_unmounted_disks of this NormalizationConfiguration.  # noqa: E501
        :rtype: bool
        """
        return self._mount_all_unmounted_disks

    @mount_all_unmounted_disks.setter
    def mount_all_unmounted_disks(self, mount_all_unmounted_disks):
        """Sets the mount_all_unmounted_disks of this NormalizationConfiguration.

        Whether unmounted disks should be mounted during normalization  # noqa: E501

        :param mount_all_unmounted_disks: The mount_all_unmounted_disks of this NormalizationConfiguration.  # noqa: E501
        :type: bool
        """

        self._mount_all_unmounted_disks = mount_all_unmounted_disks

    @property
    def prewarm_directory(self):
        """Gets the prewarm_directory of this NormalizationConfiguration.  # noqa: E501

        Whether prewarming should be performed during normalization  # noqa: E501

        :return: The prewarm_directory of this NormalizationConfiguration.  # noqa: E501
        :rtype: bool
        """
        return self._prewarm_directory

    @prewarm_directory.setter
    def prewarm_directory(self, prewarm_directory):
        """Sets the prewarm_directory of this NormalizationConfiguration.

        Whether prewarming should be performed during normalization  # noqa: E501

        :param prewarm_directory: The prewarm_directory of this NormalizationConfiguration.  # noqa: E501
        :type: bool
        """

        self._prewarm_directory = prewarm_directory

    @property
    def resize_root_partition(self):
        """Gets the resize_root_partition of this NormalizationConfiguration.  # noqa: E501

        Whether the root partition should be resized during normalization  # noqa: E501

        :return: The resize_root_partition of this NormalizationConfiguration.  # noqa: E501
        :rtype: bool
        """
        return self._resize_root_partition

    @resize_root_partition.setter
    def resize_root_partition(self, resize_root_partition):
        """Sets the resize_root_partition of this NormalizationConfiguration.

        Whether the root partition should be resized during normalization  # noqa: E501

        :param resize_root_partition: The resize_root_partition of this NormalizationConfiguration.  # noqa: E501
        :type: bool
        """

        self._resize_root_partition = resize_root_partition

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, NormalizationConfiguration):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
