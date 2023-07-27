# Machine specific configurations

MACHINE_TFM_REQUIRE ?= ""
MACHINE_TFM_REQUIRE:corstone1000 = "trusted-firmware-m-corstone1000.inc"

EXTRA_OECMAKE:tc += "-DCC312_LEGACY_DRIVER_API_ENABLED=ON"

require ${MACHINE_TFM_REQUIRE}
