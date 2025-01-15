# Firmware Image Package (FIP)
# It is a packaging format used by TF-A to package the
# firmware images in a single binary.

DESCRIPTION = "fiptool - Trusted Firmware tool for packaging"
LICENSE = "BSD-3-Clause"

SRC_URI_TRUSTED_FIRMWARE_A ?= "git://git.trustedfirmware.org/TF-A/trusted-firmware-a.git;protocol=https"
SRC_URI = "${SRC_URI_TRUSTED_FIRMWARE_A};branch=${SRCBRANCH}"
LIC_FILES_CHKSUM = "file://docs/license.rst;md5=83b7626b8c7a37263c6a58af8d19bee1"

SRCREV = "f2735ebccf5173f74c0458736ec526276106097e"
SRCBRANCH = "master"

# igraph and pyploty are only required for visualization features
DEPENDS += " \
    python3-click-native \
    python3-pydevicetree-native \
    python3-pyparsing-native \
    "

S = "${UNPACKDIR}/git"
PEP517_SOURCE_PATH = "${S}/tools/cot_dt2c"

inherit python_poetry_core native
