require trusted-firmware-a.inc

# TF-A v2.8.6
SRCREV_tfa = "ff0bd5f9bb2ba2f31fb9cec96df917747af9e92d"
SRCBRANCH = "lts-v2.8"

SRC_URI += "file://rwx-segments.patch"

# Enable passing TOS_FW_CONFIG from FIP package to Trusted OS.
SRC_URI:append:qemuarm64-secureboot = " \
            file://add-spmc_manifest-for-qemu.patch \
            file://feat-qemu-update-abi-between-spmd-and-spmc.patch \
        "

LIC_FILES_CHKSUM += "file://docs/license.rst;md5=b2c740efedc159745b9b31f88ff03dde"

# mbed TLS v2.28.3
SRC_URI_MBEDTLS = "git://github.com/ARMmbed/mbedtls.git;name=mbedtls;protocol=https;destsuffix=git/mbedtls;branch=mbedtls-2.28"
SRCREV_mbedtls = "981743de6fcdbe672e482b6fd724d31d0a0d2476"

LIC_FILES_CHKSUM_MBEDTLS = "file://mbedtls/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"
