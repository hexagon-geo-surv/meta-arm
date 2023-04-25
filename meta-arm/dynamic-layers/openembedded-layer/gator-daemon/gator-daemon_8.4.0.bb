SUMMARY = "DS-5 Streamline Gator daemon"
DESCRIPTION = "Target-side daemon gathering data for ARM Streamline \
               Performance Analyzer."
HOMEPAGE = "https://github.com/ARM-software/gator"

# Note that Gator uses the Linux Perf API for
# most of its data collection. Check that your Kernel follow the
# configuration requirement specified here:
# https://github.com/ARM-software/gator#kernel-configuration

LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
                    file://libsensors/COPYING.LGPL;md5=4fbd65380cdd255951079008b364516c \
                    file://k/perf_event.h;endline=14;md5=e548bf30a60b2ed11ef2dcf7bfdac230 \
                   "

SRCREV = "75662ba2dc2e1c7a17cff640a35629dca99c5b79"
SRC_URI = "git://github.com/ARM-software/gator.git;protocol=http;branch=main;protocol=https"

S = "${WORKDIR}/git/daemon"

DEPENDS = "boost libmxml pkgconfig-native protobuf protobuf-native"

COMPATIBLE_HOST = "aarch64.*-linux"

inherit cmake

EXTRA_OECMAKE += "-DENABLE_VCPKG=OFF -DGATOR_INSTALL_PREFIX=./bin"
