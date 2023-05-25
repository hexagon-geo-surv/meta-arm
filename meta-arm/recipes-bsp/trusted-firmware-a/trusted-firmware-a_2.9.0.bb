require trusted-firmware-a.inc

# TF-A v2.9.0
SRCREV_tfa = "d3e71ead6ea5bc3555ac90a446efec84ef6c6122"

LIC_FILES_CHKSUM += "file://docs/license.rst;md5=b2c740efedc159745b9b31f88ff03dde"

# mbed TLS v2.28.3
SRC_URI_MBEDTLS = "git://github.com/ARMmbed/mbedtls.git;name=mbedtls;protocol=https;destsuffix=git/mbedtls;branch=mbedtls-2.28"
SRCREV_mbedtls = "981743de6fcdbe672e482b6fd724d31d0a0d2476"

LIC_FILES_CHKSUM_MBEDTLS = "file://mbedtls/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"
