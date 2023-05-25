require trusted-firmware-a.inc

# TF-A v2.9.0
SRCREV_tfa = "d3e71ead6ea5bc3555ac90a446efec84ef6c6122"

# Enable passing TOS_FW_CONFIG from FIP package to Trusted OS.
SRC_URI:append:qemuarm64-secureboot = " \
            file://add-spmc_manifest-for-qemu.patch \
            file://feat-qemu-update-abi-between-spmd-and-spmc.patch \
        "

LIC_FILES_CHKSUM += "file://docs/license.rst;md5=b2c740efedc159745b9b31f88ff03dde"

# mbed TLS v2.28.2
SRC_URI_MBEDTLS = "git://github.com/ARMmbed/mbedtls.git;name=mbedtls;protocol=https;destsuffix=git/mbedtls;branch=mbedtls-2.28"
SRCREV_mbedtls = "89f040a5c938985c5f30728baed21e49d0846a53"

LIC_FILES_CHKSUM_MBEDTLS = "file://mbedtls/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"
