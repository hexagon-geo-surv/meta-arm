# Description, License, and version from tools/cot_dt2c/pyproject.toml in TF-A source
DESCRIPTION = "CoT-dt2c Tool is a python script to convert CoT DT file into corresponding C file"
LICENSE = "BSD-3-Clause"

SRC_URI_TRUSTED_FIRMWARE_A ?= "git://git.trustedfirmware.org/TF-A/trusted-firmware-a.git;protocol=https"
SRC_URI = "${SRC_URI_TRUSTED_FIRMWARE_A};destsuffix=cot-dt2c-${PV};branch=${SRCBRANCH}"
LIC_FILES_CHKSUM = "file://docs/license.rst;md5=83b7626b8c7a37263c6a58af8d19bee1"

# Use cot-dt2c from TF-A v2.12.0
SRCREV = "4ec2948fe3f65dba2f19e691e702f7de2949179c"
SRCBRANCH = "master"

inherit setuptools3_legacy python_poetry_core

BBCLASSEXTEND = "native nativesdk"

RDEPENDS:${PN} += "python3-pydevicetree python3-click python3-pathlib2"

PEP517_SOURCE_PATH = "${S}/tools/cot_dt2c"
SETUPTOOLS_SETUP_PATH = "${S}/tools/cot_dt2c"
