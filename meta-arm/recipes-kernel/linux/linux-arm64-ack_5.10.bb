# SPDX-License-Identifier: Apache-2.0
#
# Copyright (c) 2021 Arm Limited
#
require linux-arm64-ack.inc

SRC_URI = " \
    git://android.googlesource.com/kernel/common.git;protocol=https;branch=android12-5.10-lts \
    "

# tag: ASB-2022-05-05_12-5.10
SRCREV = "0780756946db50a7a17d98876958ed96e5fdee68"
