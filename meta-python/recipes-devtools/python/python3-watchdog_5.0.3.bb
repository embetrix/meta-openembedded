SUMMARY = "Filesystem events monitoring"
DEPENDS = "python3-argh"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI[sha256sum] = "108f42a7f0345042a854d4d0ad0834b741d421330d5f575b81cb27b883500176"

inherit pypi setuptools3

RDEPENDS:${PN} = " \
    python3-argh \
    python3-pathtools3 \
    python3-pyyaml \
    python3-requests \
"

BBCLASSEXTEND = "native nativesdk"