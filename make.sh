#!/bin/bash

#===========================================================================
# Task 3 - AnagramOS
# Execute from project's root folder
# This is for compiling Java source & test code, checking code coverage
# and creating application Java archive (AnagramOS.jar) file in 'dist' folder.
# Java archive is not created if any test failed or code coverage not been met.
#===========================================================================

./mvnw clean package clean
exit 0

