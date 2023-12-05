SRCREV_edk2           ?= "8736b8fdca85e02933cdb0a13309de14c9799ece"
SRCREV_edk2-platforms ?= "cf8a7168c3e8b56b41e09097660c5a6048f1b8ef"

# FIXME - clang is having issues with antlr
TOOLCHAIN:aarch64 = "gcc"

require recipes-bsp/uefi/edk2-firmware.inc
