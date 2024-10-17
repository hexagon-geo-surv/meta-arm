ARMFILESPATHS := "${THISDIR}/${PN}:"

FILESEXTRAPATHS:prepend:aarch64 = "${ARMFILESPATHS}"
SRC_URI:append:aarch64 = " \
    file://0001-Revert-memory-fsl_ifc-Make-FSL_IFC-config-visible-an.patch \
    "

COMPATIBLE_MACHINE:generic-arm64 = "generic-arm64"
FILESEXTRAPATHS:prepend:generic-arm64 = "${ARMFILESPATHS}"
SRC_URI:append:generic-arm64 = " \
    file://tcpci.cfg \
    "

FILESEXTRAPATHS:prepend:qemuarm64-secureboot = "${ARMFILESPATHS}"
SRC_URI:append:qemuarm64-secureboot = " \
    file://skip-unavailable-memory.patch \
    file://tee.cfg \
    "

FILESEXTRAPATHS:prepend:qemuarm64 = "${ARMFILESPATHS}"
SRC_URI:append:qemuarm64 = " file://efi.cfg"

FILESEXTRAPATHS:prepend:qemuarm = "${ARMFILESPATHS}"
SRC_URI:append:qemuarm = " file://efi.cfg"
