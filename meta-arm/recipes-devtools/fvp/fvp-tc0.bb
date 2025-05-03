require fvp-ecosystem.inc

MODEL = "TC0"
MODEL_CODE = "FVP_TC0"
PV = "11.17.18"

SRC_URI = "https://developer.arm.com/-/cdn-downloads/permalink/FVPs-Total-Compute/Total-Compute-TC0/${MODEL_CODE}_${PV_URL}.tgz;subdir=${BP}"
SRC_URI[sha256sum] = "0bd78354e036a7e92bd7f8cbd78cd2b5197dc0872fe2b25c95ea734929fe83b8"

# The CSS used in the FVP homepage make it too difficult to query with the tooling currently in Yocto
UPSTREAM_VERSION_UNKNOWN = "1"

LIC_FILES_CHKSUM = "file://license_terms/license_agreement.txt;md5=1a33828e132ba71861c11688dbb0bd16 \
                    file://license_terms/third_party_licenses.txt;md5=41029e71051b1c786bae3112a29905a7"
