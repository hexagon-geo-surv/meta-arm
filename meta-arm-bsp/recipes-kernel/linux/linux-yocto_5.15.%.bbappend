FILESEXTRAPATHS:prepend := "${THISDIR}/linux-yocto-5.15:"

SRC_URI:append = " file://defconfig.patch"
