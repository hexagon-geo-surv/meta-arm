LIC_FILES_CHKSUM = "file://COPYING;md5=2d9514d69d8abf88b6e9125e759bf0ab \
                    file://LICENSE;md5=a585e2893cee63d16a1d8bc16c6297ec"

SRC_URI = "git://gem5.googlesource.com/public/gem5;protocol=https;nobranch=1 \
           file://mapping.patch"
RELEASE_TAG = "v21.2.1.1"
SRCREV = "e4fae58da6c044b6efec62392ff99f343ce67947"

PV = "${RELEASE_TAG}"

S = "${WORKDIR}/git"
