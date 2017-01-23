# SupportLibRTLCrash
This repo contains a sample project demonstrating a crash in android support library version 25.1.0 when using TextInputLayout in the locale "ar_XB", which is the right-to-left psuedolocale

Note that when viewing this crash in Android Studio, it can look like the error is: error in parsing "", but there is actually a character in those quotes. It is the "right to left override character" (&#8238), which has no visual representation.
