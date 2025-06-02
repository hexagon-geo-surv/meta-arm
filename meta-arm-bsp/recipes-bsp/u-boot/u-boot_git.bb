require recipes-bsp/u-boot/u-boot-common.inc
require recipes-bsp/u-boot/u-boot.inc

DEPENDS += "bc-native dtc-native gnutls-native python3-pyelftools-native"

# v2025.01 tag
SRCREV = "6d41f0a39d6423c8e57e92ebbe9f8c0333a63f72"
SRC_URI = "git://source.denx.de/u-boot/u-boot.git;protocol=https;branch=master"

# Not a release recipe, try our hardest to not pull this in implicitly
DEFAULT_PREFERENCE = "-1"
