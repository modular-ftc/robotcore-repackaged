/*
 * Decompiled with CFR 0_133.
 */
package org.firstinspires.ftc.robotcore.internal.camera;

public class format_convertBitCode {
    private static int bitCode32Length = 2924;
    private static int bitCode64Length = 3048;

    public static byte[] getBitCode32() {
        return format_convertBitCode.getBitCode32Internal();
    }

    private static byte[] getSegment32_0() {
        byte[] data = new byte[]{-34, -64, 23, 11, 0, 0, 0, 0, 44, 0, 0, 0, 64, 11, 0, 0, 0, 0, 0, 0, 21, 0, 0, 0, 0, 0, 0, 0, 1, 64, 4, 0, 106, 9, 0, 0, 2, 64, 4, 0, 3, 0, 0, 0, 66, 67, -64, -34, 33, 12, 0, 0, -51, 2, 0, 0, 1, 16, 0, 0, 18, 0, 0, 0, 7, -127, 35, -111, 65, -56, 4, 73, 6, 16, 50, 57, -110, 1, -124, 12, 37, 5, 8, 25, 30, 4, -117, 98, -128, 20, 69, 2, 66, -110, 11, 66, -92, 16, 50, 20, 56, 8, 24, 73, 10, 50, 68, 36, 72, 10, -112, 33, 35, -60, 82, -128, 12, 25, 33, 114, 36, 7, -56, 72, 17, 98, -88, -96, -88, 64, -58, -16, 1, 0, 0, 0, 73, 24, 0, 0, 47, 0, 0, 0, 11, -124, -1, -1, -1, -1, 31, -64, 96, -127, -16, -1, -1, -1, -1, 3, -80, 0, 9, 2, 33, 24, -126, -1, -1, -1, -1, 31, -64, 24, 4, 65, 16, 20, 22, 16, 64, -16, -1, -1, -1, -1, 3, 24, -125, 32, 8, -126, -62, 2, 6, 16, 2, 65, 16, 6, -127, 16, -2, -1, -1, -1, 127, 0, 99, 16, 4, 65, 80, 88, -128, 4, -127, 16, 12, -63, -1, -1, -1, -1, 15, 96, -76, -64, 0, -124, 64, -8, -1, -1, -1, -1, 1, -116, 65, 16, 4, 65, 97, -127, 2, 8, -127, 32, 8, -125, -16, -1, -1, -1, -1, 3, 24, 45, 16, -2, -1, -1, -1, 127, 0, -125, 5, 2, 16, 44, 48, -126, 64, 8, -122, 96, -127, 2, 8, -127, 32, 8, -125, 64, 8, 11, -112, 32, 16, -126, 33, -8, -1, -1, -1, -1, 1, -116, 22, 16, -128, 16, 8, 11, -120, 0, -8, -1, -1, -1, -1, 1, 12, 22, 40, -128, 16, 8, -126, 48, 8, -1, -1, -1, -1, 63, -128, 17, 0, 0, 0, 0, -119, 32, 0, 0, 30, 0, 0, 0, 50, 34, 72, 9, 32, 100, -123, 4, -109, 34, -92, -124, 4, -109, 34, -29, -124, -95, -112, 20, 18, 76, -118, -116, 11, -124, -92, 76, 16, 124, 115, 4, 96, 64, -32, 40, 105, -118, 40, 97, -14, 35, -23, 7, -106, -59, 17, -128, 9, 113, 26, 20, 4, 18, 115, 4, -56, 48, 2, 65, -108, -95, 0, 64, 38, 3, 64, 33, 10, 2, -128, 82, 33, 10, 33, -124, 86, 17, 72, -95, 54, 71, 0, -107, -30, -67, -9, 30, -63, 17, -128, 18, 72, -102, 69, -112, -125, 106, 17, -34, -93, 91, -120, -9, -34, -93, 60, 16, 48, 71, 16, 76, 1, -52, 17, -128, 2, 0, 0, 0, 19, -80, 112, -112, -121, 118, -80, -121, 59, 104, 3, 119, 120, 7, 119, 40, -121, 54, 96, -121, 116, 112, -121, 122, -64, -121, 54, 56, 7, 119, -88, -121, 114, 8, 7, 113, 72, -121, 13, 100, 80, 14, 109, 0, 15, 122, 48, 7, 114, -96, 7, 115, 32, 7, 109, -112, 14, 118, 64, 7, 122, 96, 7, 116, -48, 6, -10, 16, 7, 114, -128, 7, 122, 96, 7, 116, -96, 7, 113, 32, 7, 120, -48, 6, -18, 48, 7, 114, -48, 6, -77, 96, 7, 116, -96, -13, 64, -124, 4, 50, 66, 68, 4, -32, 38, 124, -121, 18, 0, 15, 50, 0, 0, 16, 0, 59, -108, 0, 120, -112, 1, 0, -128, 0, 24, -94, 28, 0, 0, 4, 0, 0, 0, -63, 16, 69, 1, 2, 64, 0, 0, 0, 8, -122, 40, 12, 2, 12, 3, 0, 0, 64, 48, 68, 113, 16, 96, 32, 0, 0, 0, -126, 33, -118, -125, 0, 3, 1, 0, 0, 16, 12, 81, 34, 4, 24, 10, 0, 0, -128, 96, -120, 66, 1, 0, 16, 0, 0, 0, 4, 67, 20, 11, 8, 0, 1, 0, 0, 32, 24, -94, 48, 64, 0, 24, 0, 0, 0, -63, 16, 5, 67, -128, -31, 0, 0, 0, 8, -122, 40, 26, 16, 0, 8, 0, 0, 64, -112, 5, 2, 0, 0, 7, 0, 0, 0, 50, 30, -104, 20, 25, 17, 76, -112, -116, 9, 38, 71, -58, 4, 67, 2, 35, 0, 37, 80, 8, -28, 71, 0, 72, -116, 0, 0, 121, 24, 0, 0, -128, 0, 0, 0, 26, 3, 76, -112, 70, 2, 19, 52, 68, 0, 30, 42, 119, 99, 104, 97, 114, 95, 115, 105, 122, 101, 67, 4, 0, 26, 98, 0, -49, 22, 0, 16, -101, -74, 52, -73, -81, 50, -73, -70, -74, -81, -71, 52, -67, -78, 33, 6, -16, 108, 4, 0, -111, 15, -126, -36, -56, -28, -34, -46, -56, 64, -58, -40, -62, -36, -50, 64, -20, -54, -28, -26, -46, -34, -36, 64, 102, 92, 112, 92, 100, 110, 106, 104, 112, 96, 64, 64, 80, -60, -62, -26, -54, -56, 64, -34, -36, 64, -104, -104, -84, -102, 64, 102, 92, 112, 92, 100, 110, 106, 104, 112, 96, 82, -122, 8, -101, -63, -61, -82, 76, 110, 46, -19, -51, -115, 65, -52, 16, 98, 67, -74, -124, -111, 90, -104, 93, -40, 23, 92, -40, -40, 90, -40, 89, -39, -105, 91, 88, 91, 25, -33, -32, 77, -18, -52, -59, 44, 77, 110, -114, 46, -51, 109, 14, 46, 77, -82, 108, -50, -59, -116, 110, -52, 69, -18, 77, -20, -115, 110, -20, 77, -82, -52, 37, -51, -115, -82, 76, -50, 45, -116, -51, 101, 44, -84, -83, 76, 46, 108, 8, -79, 45, 27, -61, 39, -51, 13, -82, -114, 46, -120, -115, -19, 109, 44, -116, 46, -19, -51, -115, -126, 12, -52, 16, 98, 115, -74, -121, -53, 91, 29, 29, 92, 29, -35, 85, 26, 25, 29, 26, -125, -102, 33, -60, 22, 109, 18, -103, -73, 58, 58, -72, 58, 58, -92, -78, -76, 51, 52, -70, 33, -60, 70, 109, 18, 3, -104, 33, -62, 102, -111, -112, 123, 123, -93, 27, 34, 108, 24, -95, -68, 58, 59, -103, 47, -70, -73, -81, 48, -71, 51, 49, 28, 28, 28, -100, 33, -62, -90, 81, -88, -63, 25, 34, 108, 28, -121, 52, 55, 58, 62, 111, 109, 110, 105, 112, 111, 116, 101, 110, 116, 32, 99, 104, 97, 114, -116, -90, -46, -38, -32, -40, -54, 64, -122, 94, -122, 86, 86, 64, -88, -124, -126, -126, -122, 8, 27, 24, 12, 17, -68, 104, -120, -79, 125, 91, 24, 120, -47, 16, 99, -13, -74, 49, -16, -94, 33, -58, 70, 6, 27, 25, 120, 81, 35, 54, 54, -69, 54, -105, -74, 55, -78, 58, -74, 50, 23, 51, -74, -80, -77, -71, 41, -62, 80, 84, 97, 99, -77, 107, 115, 73, 35, 43, 115, -93, -101, 18, 28, 61, 70, -32, -28, -62, -50, -38, -62, -90, 8, 74, 83, 103, 68, 110, -18, -85, 12, 15, -18, 77, -114, -18, -53, 46, 76, 110, -54, 0, 77, 85, -95, 17, -71, -71, -81, 55, 49, -75, -78, 49, -70, -81, 57, -74, 55, -70, -71, 41, -63, -43, 107, 68, 110, -18, -85, 12, 15, -18, 77, -114, -18, -53, -20, 77, -82, 44, 108, 12, -19, -53, 45, -84, -83, 108, -118, -112, 109, -107, 70, -28, -26, -66, -54, -16, -32, -34, -28, -24, -66, -52, -34, -28, -54, -62, -58, -48, -90, 8, 87, 7, 0, 121, 24, 0, 0, 92, 0, 0, 0, 51, 8, -128, 28, -60, -31, 28, 102, 20, 1, 61, -120, 67, 56, -124, -61, -116, 66, -128, 7, 121, 120, 7, 115, -104, 113, 12, -26, 0, 15, -19, 16, 14, -12, -128, 14, 51, 12, 66, 30, -62, -63, 29, -50, -95, 28, 102, 48, 5, 61, -120, 67, 56, -124, -125, 27, -52, 3, 61, -56, 67, 61, -116, 3, 61, -52, 120, -116, 116, 112, 7, 123, 8, 7, 121, 72, -121, 112, 112, 7, 122, 112, 3, 118, 120, -121, 112, 32, -121, 25, -52, 17, 14, -20, -112, 14, -31, 48, 15, 110, 48, 15, -29, -16, 14, -16, 80, 14, 51, 16, -60, 29, -34, 33, 28, -40, 33, 29, -62, 97, 30, 102, 48, -119, 59, -68, -125, 59, -48, 67, 57, -76, 3, 60, -68, -125, 60, -124, 3, 59, -52, -16, 20, 118, 96, 7, 123, 104, 7, 55, 104, -121, 114, 104, 7, 55, -128, -121, 112, -112, -121, 112, 96, 7, 118, 40, 7, 118, -8, 5, 118, 120, -121, 119, -128, -121, 95, 8, -121, 113, 24, -121, 114, -104, -121, 121, -104, -127, 44, -18, -16, 14, -18, -32, 14, -11, -64, 14, -20, 48, 3, 98, -56, -95, 28, -28, -95, 28, -52, -95, 28, -28, -95, 28, -36, 97, 28, -54, 33, 28, -60, -127, 29, -54, 97, 6, -42, -112, 67, 57, -56, 67, 57, -104, 67, 57, -56, 67, 57, -72, -61, 56, -108, 67, 56, -120, 3, 59, -108, -61, 47, -68, -125, 60, -4, -126, 59, -44, 3, 59, -80, -61, 12, -57, 105, -121, 112, 88, -121, 114, 112, -125, 116, 104, 7, 120, 96, -121, 116, 24, -121, 116, -96, -121, 25, -50, 83, 15, -18, 0, 15, -14, 80, 14, -28, -112, 14, -29, 64, 15, -31, 32, 14, -20, 80, 14, 51, 32, 40, 29, -36, -63, 30, -62, 65, 30, -46, 33, 28, -36, -127, 30, -36, -32, 28, -28, -31, 29, -22, 1, 30, 102, 24, 81, 56, -80, 67, 58, -100, -125, 59, -52, 80, 36, 118, 96, 7, 123, 104, 7, 55, 96, -121, 119, 120, 7, 120, -104, 81, 76, -12, -112, 15, -16, 80, 14, 0, 0, 113, 32, 0, 0, 47, 0, 0, 0, 70, -96, 6, -1, 108, -41, -111, 4, 18, -109, -73, 16, 12, -47, 76, -38, -12, 83, -62, 1, 68, 120, 125, 71, -46, 15, 44, -117, 35, 0, 19, -30, 52, 73, 98, 11, -39, 63, -41, 124, 36, -55, 84, -43, 58, 43, -72, 105, 63, 37, 28, 64, -124, 31, -57, 97, 2, -116, 67, 77, 15, 53, -123, 4, 98, 28, -109, 25, 12, 20, 90, -40, -63, 80, -95, -123, 49, 16, -62, -126, 60, 22, -80, 56, -44, -12, 80, 19, -116, 12, -45, 97, 3, 16, 70, 85, -10, 63, 57, 63, 16, 25, 1, -49, -13, -68, 21, 44, -111, 17, 0, 95, -28, 48, -78, -5, 26, -64, -125, 52, 15, 53, 105, -53, -30, 8, -64, -124, 56, -115, 53, 44, -1, -100, 11, 11, -64, 60, -110, 36, 25, -62, -126, 81, 21, 110, -45, -109, -125, -37, -74, 37, 32, 126, 36, -7, -61, -28, 68, -90, 16, 6, -1, 92, -33, -111, -60, 45, 4, 16, -95, 65, 66, 8, 83, 90, -33, -111, -12, 3, -53, -30, 8, -64, -124, 56, 13, 0, 97, 32, 0, 0, -79, 0, 0, 0, 19, 4, 73, 44, 16, 0, 0, 0, 4, 0, 0, 0, 4, -118, -96, 6, -54, -96, 18, 40, -40, 14, 0, 66, 51, 0, 0, 0, 53, 61, 72, -39, -104, 109, -48, 56, 96, -60, -64, 72, 2, -94, -37, -88, -102, 30, 29, 110, -8, 28, 48, -104, 101, 8, 4, 48, 24, 67, -16, -100, 17, 3, 66, -119, 12, 111, -60, -128, 80, -94, -61, 27, 49, 48, -106, -88, 8, 3, 49, 24, -125, 89, 2, 100, -72, 97, -70, -56, 96, -106, 97, 32, -54, -64, -74, 7, 2, -74, 85, 16, -104, 37, 56, 40, 24, -122, 6, 24, 8, -122, 27, -46, 96, 34, -125, 89, -122, -62, 80, -125, 66, -125, 42, 109, 13, 44, 16, -40, 102, -127, 96, -106, -32, -80, -19, -127, -128, 109, 22, 8, 108, -85, 32, 48, 75, 112, 12, 116, 0, 103, 48, -80, 65, 1, 7, -58, 64, 7, -32, 12, 109, 80, -68, -127, 49, -48, 1, -104, -63, -64, 6, -123, 27, 24, -108, -115, -39, 6, -115, 14, -128, 17, 3, 35, 9, -120, 58, -112, 3, -118, -78, 49, -37, -96, -35, 1, 48, 98, 96, 36, 1, -127, 7, 115, 64, 81, 54, 102, 27, 52, 61, 0, 70, 12, -116, 36, 32, -10, 32, 14, -88, 17, 3, 66, -119, 12, -17, -6, -32, -59, -120, 1, -95, 68, -122, 29, -36, 31, -68, 24, 49, 32, -108, -56, -56, -125, 11, -123, 23, 35, 6, -124, 18, 25, 124, 112, -93, -16, 98, -60, -32, 96, 34, -60, 15, 64, 65, 20, 72, -31, 74, -127, -64, -120, 1, -95, 68, -121, 119, -89, -16, 98, -60, -128, 80, -94, -61, 14, 46, 21, 94, -116, 24, 16, 74, 116, -28, -63, -83, -62, -117, 17, 3, 66, -119, 14, 62, -72, 86, 120, 49, 98, 112, 48, 17, -126, 10, -86, -64, 10, -82, 112, -81, 64, 96, 12, -63, -85, 70, 12, -116, 37, 42, 98, -63, 20, 96, 97, -106, 0, 25, -88, 40, -56, 32, -112, -123, 35, 103, 33, 28, 8, 83, 0, 0, 0, 102, 99, 8, -64, -78, -44, -73, -27, 24, 2, -80, 44, 53, 110, 60, -122, 0, 44, 75, -99, 91, -113, 33, 0, -53, 82, -21, -10, 99, 8, -64, -78, -44, -69, 5, 25, 2, -80, 44, 117, 111, 83, 72, 68, 76, 21, -80, -8, -76, 109, 12, -46, 17, 25, 77, -30, 83, -51, 3, 8, -118, -82, -37, 77, -30, 83, -51, 3, 8, -118, -66, -101, 78, -30, 83, -51, 3, 8, -118, -50, -37, -112, 33, 0, -53, 98, -41, -58, 66, 72, 84, -64, 91, 11, 33, 81, 65, 111, 71, -122, 0, 44, -117, -99, 91, -110, 33, 0, -53, 98, -17, 86, 100, 8, -64, -78, -40, -73, 45, 25, 2, -80, 44, 118, 111, 34, -123, 0, 44, 75, 109, 35, -123, 0, 44, -117, 109, 36, -123, 0, 44, -53, 109, 31, 3, -48, 12, 118, 66, 0, -61, -112, 91, -109, 33, 0, -53, 114, -41, -10, 100, 8, -64, -78, -36, -73, 73, 25, 2, -80, 44, 119, 110, 62, -124, -32, 52, -107, 1, 25, -126, -45, 84, 53, 111, 19, -63, 101, 20, 1, 102, 68, -122, -32, 52, -107, 109, -101, -112, 33, 56, 77, 101, -45, 102, 100, 8, 78, 83, -39, -72, 121, 16, 2, -80, 44, -122, 100, 8, 78, 83, -39, -70, 41, 25, -126, -45, 84, 54, 111, 50, 9, 98, 34, 13, 37, -43, 62, 109, 76, -122, -32, 52, -43, 77, -101, -109, 33, 56, 77, 117, -37, 54, -125, 32, -23, 66, 73, -75, 79, 27, -108, 33, 56, 77, 117, -29, 6, 50, 8, -52, 99, 41, -125, 68, 5, -26, 82, 0, -61, 80, -45, -10, 82, 72, 84, 80, -41, 6, 83, 0, -61, 80, -37, 86, 66, 8, -52, -125, -101, 10, 33, 48, -113, 110, 49, 8, -110, 46, -108, 100, -5, -76, -83, 16, -46, 17, -19, 102, 50, 0, -61, 96, 28, -121, 79, 53, 15, 32, 40, 0, 0, 1, 49, 0, 0, 2, 0, 0, 0, 91, -122, 40, 40, 3, 0, 0, 0, 0, 0, 0, 0, 97, 32, 0, 0, 10, 0, 0, 0, 19, 4, -63, -120, -127, -47, 4, -53, 68, 85, 105, -123, 3, 1, 0, 0, 4, 0, 0, 0, 70, 17, 80, 86, 17, 84, 54, 17, 96, 102, 65, 8, -64, -78, 0, 0, 0, 0, 0, 0, 97, 32, 0, 0, 7, 0, 0, 0, 19, 4, -63, 24, -62, -12, 36, 21, 14, 4, 0, 0, 2, 0, 0, 0, 54, 49, 96, 84, 5, 0, 0, 0, 0, 0, 0, 0, 97, 32, 0, 0, 10, 0, 0, 0, 19, 4, 65, 44, 16, 0, 0, 0, 1, 0, 0, 0, 4, -54, 0, 0, 99, 8, 19, -107, 85, 56, 16, 0, 2, 0, 0, 0, 54, 49, 96, 84, 5, 0, 0, 0, 0, 0, 0, 0, 97, 32, 0, 0, 42, 0, 0, 0, 19, 4, 65, 44, 16, 0, 0, 0, 2, 0, 0, 0, 4, 74, -94, 32, 0, 0, 0, 0, 55, 1, 57, 10, -120, 105, 25, 8, 108, -69, 68, 112, 21, -112, -77, -128, 24, -42, -123, -64, 62, 47, 4, 5, 6, 28, 84, 24, 64, 120, 98, -16, 96, -60, -128, 112, 34, 102, 12, -110, 12, -62, -127, 0, 24, 0, 0, 0, 70, 113, 8, 72, -70, 80, 82, 109, 22, -121, -128, -92, 11, 37, -39, 38, 66, 72, 71, -76, -37, 7, 2, 12, 3, -18, 55, -124, 97, 26, -123, -32, 52, 85, 109, 29, -123, -32, 52, -107, 109, 21, -120, -128, -104, 72, 67, 73, -75, -127, 12, 18, 21, -40, -124, 32, 32, -74, 49, 0, -61, 96, 28, 3, 67, 45, -26, 81, 8, 78, 83, -35, -106, 65, 8, 78, 83, -39, 72, 33, 56, 77, -91, 27, 9, 33, 0, -53, 98, 33, 4, 48, 12, 57, 0, 0, 0, 0, 0, 0, 97, 32, 0, 0, 3, 0, 0, 0, 19, 4, -63, -120, 1, -15, 4, 10, -128, 0, 0, 0, 97, 32, 0, 0, 13, 0, 0, 0, 19, 4, 65, 44, 16, 0, 0, 0, 2, 0, 0, 0, -12, 70, 0, -54, 127, 0, 0, 0, 35, 6, 6, 20, 52, 19, 85, -91, 21, 14, 4, 0, 3, 0, 0, 0, 102, 65, 8, -64, -78, -40, 68, 81, 1, 11, 69, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        return data;
    }

    private static byte[] getBitCode32Internal() {
        byte[] bc = new byte[bitCode32Length];
        int offset = 0;
        byte[] seg = format_convertBitCode.getSegment32_0();
        System.arraycopy((Object)seg, 0, (Object)bc, offset, seg.length);
        offset += seg.length;
        return bc;
    }

    public static byte[] getBitCode64() {
        return format_convertBitCode.getBitCode64Internal();
    }

    private static byte[] getSegment64_0() {
        byte[] data = new byte[]{-34, -64, 23, 11, 0, 0, 0, 0, 44, 0, 0, 0, -68, 11, 0, 0, 0, 0, 0, 0, 21, 0, 0, 0, 0, 0, 0, 0, 1, 64, 4, 0, 106, 9, 0, 0, 2, 64, 4, 0, 3, 0, 0, 0, 66, 67, -64, -34, 33, 12, 0, 0, -20, 2, 0, 0, 1, 16, 0, 0, 18, 0, 0, 0, 7, -127, 35, -111, 65, -56, 4, 73, 6, 16, 50, 57, -110, 1, -124, 12, 37, 5, 8, 25, 30, 4, -117, 98, -128, 24, 69, 2, 66, -110, 11, 66, -60, 16, 50, 20, 56, 8, 24, 73, 10, 50, 68, 36, 72, 10, -112, 33, 35, -60, 82, -128, 12, 25, 33, 114, 36, 7, -56, -120, 17, 98, -88, -96, -88, 64, -58, -16, 1, 0, 0, 0, 73, 24, 0, 0, 23, 0, 0, 0, 11, -124, -1, -1, -1, -1, 31, -64, 96, -127, -16, -1, -1, -1, -1, 3, -80, -64, 8, 64, 16, 4, 65, -112, 16, 64, 16, 4, 65, -112, -8, -1, -1, -1, -1, 1, 12, 22, 8, -1, -1, -1, -1, 63, -128, 49, 8, -126, 32, 40, 44, 16, -2, -1, -1, -1, 127, 0, 99, 16, 4, 65, 80, 88, 32, -4, -1, -1, -1, -1, 0, 70, 11, -120, 0, -8, -1, -1, -1, -1, 1, 12, 22, 8, -1, -1, -1, -1, 63, -128, 17, 0, -119, 32, 0, 0, 34, 0, 0, 0, 50, 34, -120, 9, 32, 100, -123, 4, 19, 35, -92, -124, 4, 19, 35, -29, -124, -95, -112, 20, 18, 76, -116, -116, 11, -124, -60, 76, 16, -120, -63, 28, 1, 40, 16, 112, -106, 52, 69, -108, 48, -7, -111, -12, 3, -53, -30, 8, -64, -124, 56, -115, 79, 35, 34, 8, -126, -128, -124, 57, 2, 48, 32, 98, -114, 0, 25, 70, 32, -116, 50, 28, 4, 65, 72, 33, -114, -127, 32, 72, 25, 1, 32, 99, -114, 32, 40, 6, -45, 52, 0, -31, -48, 83, -120, -61, 48, 12, -118, -118, 96, 16, 52, -51, 17, 64, -91, -88, -86, -86, -86, -56, 42, 1, 67, 88, 17, -104, -127, -76, 34, 84, 21, 113, -123, -88, -86, -86, 34, 111, 32, 96, 10, 0, 0, 0, 19, -76, 112, 8, 7, 121, 24, 7, 116, -80, 3, 58, 104, 3, 119, 120, 7, 119, 40, -121, 54, 96, -121, 116, 112, -121, 122, -64, -121, 54, 56, 7, 119, -88, -121, 114, 8, 7, 113, 72, -121, 13, 115, 80, 14, 109, -48, 14, 122, 80, 14, 109, -112, 14, 120, -96, 7, 120, -96, 7, 115, 32, 7, 109, -112, 14, 113, 96, 7, 122, 16, 7, 118, -96, 7, 115, 32, 7, 109, -112, 14, 118, 64, 7, 122, 96, 7, 116, -48, 6, -23, 16, 7, 114, -128, 7, 122, 16, 7, 114, -128, 7, 109, -32, 14, 115, 32, 7, 122, 96, 7, 116, -48, 6, -77, 16, 7, 114, -128, 7, 58, 15, 100, 72, 32, 35, 68, 70, 0, 78, -123, -36, -95, 20, 0, -123, 12, 0, 0, 4, -64, 14, -91, 0, 40, 100, 0, 0, 32, 0, -122, 40, 9, 0, 0, 1, 0, 0, 64, 48, 68, 89, -128, 0, 16, 0, 0, 0, -126, 33, 10, 4, 4, -64, 0, 0, 0, 0, 12, 81, 36, 4, 24, 8, 0, 0, -128, 96, -120, 66, 33, -64, 80, 0, 0, 0, 4, 67, 20, 10, 1, -122, 2, 0, 0, 32, 24, -94, 92, 8, 48, 16, 0, 0, 0, -63, 16, 37, 3, 0, 32, 0, 0, 0, 8, -122, 40, 27, 16, 0, 2, 0, 0, 64, 48, 68, -111, -128, 0, 48, 0, 0, 0, -126, 33, 74, -121, 0, 3, 1, 0, 0, 16, 12, 81, 62, 32, 0, 12, 0, 0, -128, 32, 11, 4, 0, 0, 0, 8, 0, 0, 0, 50, 30, -104, 20, 25, 17, 76, -112, -116, 9, 38, 71, -58, 4, 67, 2, 70, 0, 10, -94, 64, 10, -122, -120, 17, 0, 18, 70, 0, 0, 0, 0, 121, 24, 0, 0, -125, 0, 0, 0, 26, 3, 76, -112, 70, 2, 19, 68, 62, 8, 114, 35, -109, 123, 75, 35, 3, 25, 99, 11, 115, 59, 3, -79, 43, -109, -101, 75, 123, 115, 3, -103, 113, -63, 113, -111, -71, -87, -95, -63, -127, 1, 1, 65, 17, 11, -101, 43, 35, 3, 121, 115, 3, 97, 98, -78, 106, 2, -103, 113, -63, 113, -111, -71, -87, -95, -63, -127, 73, 25, 34, -128, 1, -64, -61, -82, 76, 110, 46, -19, -51, -115, 65, -52, 16, 2, 12, 4, 48, 24, 24, -87, -123, -39, -123, 125, -63, -123, -115, -83, -123, -99, -107, 125, -71, -123, -75, -107, -15, 13, -34, -28, -50, 92, -52, -46, -28, -26, -24, -46, -36, -26, -32, -46, -28, -54, -26, 92, -52, -24, -58, 92, -28, -34, -60, -34, -24, -58, -34, -28, -54, 92, -46, -36, -24, -54, -28, -36, -62, -40, 92, -58, -62, -38, -54, -28, -62, -122, 16, 96, 80, -128, -127, -63, 39, -51, 13, -82, -114, 46, -120, -115, -19, 109, 44, -116, 46, -19, -51, -115, -126, 12, -52, 16, 2, 12, 16, 48, 72, -72, -68, -43, -47, -63, -43, -47, 93, -91, -111, -47, -95, 49, -88, 25, 66, -128, -63, 2, 6, 12, -103, -73, 58, 58, -72, 58, 58, -92, -78, -76, 51, 52, -70, 33, 4, 24, 56, 96, -64, 48, -128, 25, 34, -128, 1, 68, 66, -18, -19, -115, 110, -120, 0, 6, 18, -95, -68, 58, 59, -103, 47, -70, -73, -81, 48, -71, 51, 49, 28, 28, 28, -100, 33, 2, 24, 80, 20, 106, 112, -122, 8, 96, 96, 13, 17, -128, 103, -120, 0, 64, 92, -62, -36, -14, 64, -32, -34, -46, -36, -24, -54, -28, -8, -68, -75, -71, -91, -63, -67, -47, -107, -71, -47, -127, -116, -95, -123, -55, 49, -102, 74, 107, -125, 99, 43, 3, 25, 122, 25, 90, 89, 1, -95, 18, 10, 10, 26, 34, -128, 1, 55, -60, 0, -125, 13, 12, 58, -32, 25, 98, -128, -127, 6, 6, 30, -16, 12, 49, -64, -32, 3, -125, 15, 120, -122, 8, 64, 52, 68, 0, -92, 33, 24, -16, 0, 16, 24, -128, 1, 0, 1, 16, 24, -128, 1, 16, 1, 16, 24, -128, 1, 32, 1, 16, 24, -128, 1, -121, 52, 55, -70, 33, 6, 24, -112, 1, 24, 120, -64, 51, -60, 0, -125, 50, 0, -125, 50, 0, -98, 42, 108, 108, 118, 109, 46, 105, 100, 101, 110, 116, 83, -126, -96, -57, 8, -100, 92, -40, 89, 91, -40, 20, -127, 56, -22, -116, -56, -51, 125, -107, -31, -63, -67, -55, -47, 125, -39, -123, -55, 77, 25, -108, -26, 41, 52, 34, 55, -9, -11, 38, -90, 86, 54, 70, -9, 53, -57, -10, 70, 55, 55, 37, -120, 122, -115, -56, -51, 125, -107, -31, -63, -67, -55, -47, 125, -103, -67, -55, -107, -123, -115, -95, 125, -71, -123, -75, -107, 77, 17, -90, -86, -46, -120, -36, -36, 87, 25, 30, -36, -101, 28, -35, -105, -39, -101, 92, 89, -40, 24, -38, 20, 33, -70, 0, 121, 24, 0, 0, 92, 0, 0, 0, 51, 8, -128, 28, -60, -31, 28, 102, 20, 1, 61, -120, 67, 56, -124, -61, -116, 66, -128, 7, 121, 120, 7, 115, -104, 113, 12, -26, 0, 15, -19, 16, 14, -12, -128, 14, 51, 12, 66, 30, -62, -63, 29, -50, -95, 28, 102, 48, 5, 61, -120, 67, 56, -124, -125, 27, -52, 3, 61, -56, 67, 61, -116, 3, 61, -52, 120, -116, 116, 112, 7, 123, 8, 7, 121, 72, -121, 112, 112, 7, 122, 112, 3, 118, 120, -121, 112, 32, -121, 25, -52, 17, 14, -20, -112, 14, -31, 48, 15, 110, 48, 15, -29, -16, 14, -16, 80, 14, 51, 16, -60, 29, -34, 33, 28, -40, 33, 29, -62, 97, 30, 102, 48, -119, 59, -68, -125, 59, -48, 67, 57, -76, 3, 60, -68, -125, 60, -124, 3, 59, -52, -16, 20, 118, 96, 7, 123, 104, 7, 55, 104, -121, 114, 104, 7, 55, -128, -121, 112, -112, -121, 112, 96, 7, 118, 40, 7, 118, -8, 5, 118, 120, -121, 119, -128, -121, 95, 8, -121, 113, 24, -121, 114, -104, -121, 121, -104, -127, 44, -18, -16, 14, -18, -32, 14, -11, -64, 14, -20, 48, 3, 98, -56, -95, 28, -28, -95, 28, -52, -95, 28, -28, -95, 28, -36, 97, 28, -54, 33, 28, -60, -127, 29, -54, 97, 6, -42, -112, 67, 57, -56, 67, 57, -104, 67, 57, -56, 67, 57, -72, -61, 56, -108, 67, 56, -120, 3, 59, -108, -61, 47, -68, -125, 60, -4, -126, 59, -44, 3, 59, -80, -61, 12, -57, 105, -121, 112, 88, -121, 114, 112, -125, 116, 104, 7, 120, 96, -121, 116, 24, -121, 116, -96, -121, 25, -50, 83, 15, -18, 0, 15, -14, 80, 14, -28, -112, 14, -29, 64, 15, -31, 32, 14, -20, 80, 14, 51, 32, 40, 29, -36, -63, 30, -62, 65, 30, -46, 33, 28, -36, -127, 30, -36, -32, 28, -28, -31, 29, -22, 1, 30, 102, 24, 81, 56, -80, 67, 58, -100, -125, 59, -52, 80, 36, 118, 96, 7, 123, 104, 7, 55, 96, -121, 119, 120, 7, 120, -104, 81, 76, -12, -112, 15, -16, 80, 14, 0, 0, 113, 32, 0, 0, 53, 0, 0, 0, 70, -96, 6, -1, 108, -41, -111, 4, 18, -109, -73, 16, 12, -47, 76, -38, -12, 83, -62, 1, 68, 120, 125, 71, -46, 15, 44, -117, 35, 0, 19, -30, 52, 73, 98, 12, -39, 63, -41, 124, 36, -55, 84, -43, 58, 43, -72, 105, 63, 37, 28, 64, -124, 31, -57, 97, 2, -116, 67, 77, 15, 53, -123, 4, 98, 28, -109, 29, 12, 20, 90, 24, -62, 80, -95, -123, 53, 16, -62, -126, 60, 22, -80, 56, -44, -12, 80, 19, -116, 12, -45, 97, 3, 16, 70, 85, -10, 63, 57, 63, 16, 25, 1, -49, -13, -68, 25, 44, -111, 17, 0, 95, -28, 48, -78, -5, 26, -64, -125, 52, 15, 53, 105, -53, -30, 8, -64, -124, 56, -115, 57, 44, -1, -100, 11, 11, -64, 60, -110, 36, 89, -62, -126, 81, 21, 110, -45, -109, -125, -37, -74, 21, 100, -53, 82, 49, 62, 67, 48, -62, -125, -7, 15, -115, -16, -2, 67, 35, -68, -113, -24, -72, 41, 32, 126, 36, -7, -61, -28, 68, -74, 16, 6, -1, 92, -33, -111, -60, 45, 4, 16, -95, 65, 66, 8, 83, 90, -33, -111, -12, 3, -53, -30, 8, -64, -124, 56, 13, 0, 0, 0, 0, 97, 32, 0, 0, -55, 0, 0, 0, 19, 4, 73, 44, 16, 0, 0, 0, 6, 0, 0, 0, 4, 20, 80, 17, 16, 81, 2, 5, 81, 4, 53, 80, 6, -107, 64, -50, 8, 0, 53, -74, 3, 0, 0, 0, 51, 17, 3, -111, 17, 51, 17, 3, -111, 17, 51, 17, 3, -111, 17, 51, 17, 3, -111, 17, 85, 101, 120, 97, -48, -20, -120, 1, 2, 0, -123, 25, -128, -63, -91, 125, 35, 6, -58, 1, 16, 97, 80, 6, 86, 85, -103, 14, 55, -96, -63, 4, 6, -77, 12, -127, -112, 6, 99, 8, 103, -16, -36, 25, 16, 59, 98, 64, 0, -48, -79, 6, 35, 6, 4, 0, 33, 107, 48, 98, 96, 0, -112, -95, 6, 108, -48, 6, -77, 4, -56, 112, 67, -43, -111, -63, 44, -61, 64, -68, -127, -107, 65, 6, 1, 43, -125, 13, 2, -77, 4, 7, 5, -61, -28, -64, 3, -63, 112, -61, 28, 84, 100, 48, -53, 80, 24, 116, 80, 114, -80, -91, -43, 1, 7, 2, 43, 3, 14, 4, -77, 4, -121, -107, 65, 6, 1, 43, 3, 14, 4, 86, 6, 27, 4, 102, 9, -114, -127, 14, 34, 14, 6, 59, 40, -12, -64, 24, -24, 32, -90, -31, 14, -118, 60, 48, 6, 58, 8, 56, 24, -20, -96, -64, 3, -29, -60, -96, -39, 17, 3, 4, 0, 10, 63, 0, -125, 75, -5, 70, 12, -116, 3, 32, -60, -128, 15, -84, 27, -125, 102, 71, 12, 16, 0, 40, 64, 1, 12, 46, -19, 27, 49, 48, 14, -128, 24, -125, 62, -80, -114, 12, -102, 29, 49, 64, 0, -96, 16, 5, 48, -72, -76, 111, -60, -64, 56, 0, -126, 12, -10, -64, -70, 51, 32, 118, -60, -128, 0, -96, -125, 20, -82, 20, -86, -72, 63, 32, 118, -60, -128, 0, -96, -29, 20, 14, 21, -86, -72, 80, 32, 118, -60, -128, 0, -96, 67, 21, 110, 21, -86, -72, 81, 32, 118, -60, -128, 0, -96, -93, 21, -50, 21, -86, 24, 49, 56, 0, 40, 49, -123, 84, 96, -123, 87, 56, 88, 48, 96, -60, -128, 0, 32, -124, 20, 78, 22, -86, 24, 49, 32, 0, 8, 57, -123, -93, -123, 42, 70, 12, 8, 0, 66, 84, -31, 108, -95, -118, 17, 3, 2, -128, -112, 86, 56, 92, -88, 98, -60, -32, 0, -96, 100, 22, 106, -31, 22, 114, -31, 116, -63, -128, 49, -124, 51, -64, 70, 12, 12, 0, 50, 120, 33, 22, 118, 97, -106, 0, 25, -88, 56, -36, 32, -24, -123, 35, 125, 33, 28, 8, 81, 0, 0, 0, -26, -123, 68, -60, 84, 1, -117, 79, 91, -55, 32, 29, -111, -3, 24, 2, -80, 44, 54, 109, 52, -123, -64, 60, 53, 109, 67, -122, 0, 44, -117, -83, 91, -111, 33, 0, -53, 98, -9, 22, 100, 8, -64, -78, -40, -73, -79, 20, 2, -80, 44, -75, -75, 20, 2, -80, 44, -73, -71, 20, 2, -80, 44, -72, -95, 12, 64, 51, 24, -110, 33, 0, -53, 114, -41, 22, 67, 0, -61, -48, -37, -110, 33, 0, -53, 114, -29, -26, 100, 8, -64, -78, -36, -69, 65, 25, 2, -80, 44, 119, 111, 70, -124, -32, 52, -107, 73, 25, 2, -80, 44, -8, 109, 84, -122, 0, 44, 11, -82, -101, -107, 33, 0, -53, -126, -9, 86, 17, 92, 102, 17, 96, 118, 66, 8, -64, -78, 24, -106, 33, 0, -53, -110, -37, -58, -109, 32, 38, -46, 80, 82, -19, -45, -90, 101, 8, -64, -78, -28, -72, 117, 25, 2, -80, 44, -71, 110, 73, -122, -32, 52, -43, 109, 91, 15, -126, -92, 11, 37, -43, 62, 109, 76, -122, -32, 52, -43, -99, 91, -54, 32, 48, -113, 61, 25, -126, -45, 84, 55, 111, 51, -125, 68, 5, 102, 83, 72, 84, 80, -33, 118, 83, 72, 84, 80, -29, -122, 83, 0, -61, 80, -25, -106, 83, 72, 84, 80, -21, -90, 83, 0, -61, 80, -17, 22, 101, 8, 78, 83, -31, -76, -119, 20, 19, -13, -44, -67, 77, 25, -126, -45, 84, 56, 110, 85, -122, -32, 52, 21, -66, 91, 77, 33, 29, 81, 109, -37, 72, 49, 49, -113, 109, -37, 11, 33, 48, 15, 111, 36, -59, -60, 60, 118, 110, 87, -122, -32, 52, 85, 78, -37, 14, -126, -92, 11, 37, -39, 62, 109, 89, -122, -32, 52, 85, 126, -37, -106, 33, 56, 77, -107, -25, 6, 51, 0, -61, 96, 33, -61, -60, 60, 0, 0, 0, 1, 49, 0, 0, 7, 0, 0, 0, 91, 6, -93, 24, -125, 45, -125, 21, -104, -63, -106, -63, 12, -118, 49, -40, 50, -92, 65, 49, 6, 91, 6, 54, 40, -58, 0, 0, 0, 0, 0, 0, 97, 32, 0, 0, 10, 0, 0, 0, 19, 4, -63, -120, -127, -127, 4, 76, 101, 93, -119, -123, 3, 1, 0, 0, 4, 0, 0, 0, 102, 17, 80, 118, 17, 84, 86, 17, 96, -122, 65, 8, -64, -78, 0, 0, 0, 0, 0, 0, 97, 32, 0, 0, 12, 0, 0, 0, 19, 4, 65, 44, 16, 0, 0, 0, 1, 0, 0, 0, 4, -108, 0, 0, 87, 29, 59, -122, 112, 89, -119, -123, 3, 1, 0, 0, 3, 0, 0, 0, 86, -95, 96, 84, -27, 11, 14, 17, 9, 4, 0, 0, 0, 0, 0, 0, 97, 32, 0, 0, 12, 0, 0, 0, 19, 4, 65, 44, 16, 0, 0, 0, 1, 0, 0, 0, 4, -108, 1, 0, 87, 29, 59, -122, 112, 89, -119, -123, 3, 1, 0, 0, 3, 0, 0, 0, 86, -95, 96, 84, -27, 11, 14, 17, 9, 4, 0, 0, 0, 0, 0, 0, 97, 32, 0, 0, 43, 0, 0, 0, 19, 4, 65, 44, 16, 0, 0, 0, 2, 0, 0, 0, 68, -108, 68, 65, 20, 2, 0, 0, 87, 17, 114, 22, 33, -42, 113, 32, 48, 47, 19, -63, 93, -124, 28, 70, -120, 105, 96, 16, 2, 19, -125, 48, 8, 65, -115, -63, 7, 69, 6, 27, 94, 25, 84, 48, 98, 64, 0, 81, 99, 6, 121, 6, -31, 64, 0, 0, 24, 0, 0, 0, 102, 113, 8, 72, -70, 80, 82, 109, 24, -121, -128, -92, 11, 37, -39, 86, 66, 72, 71, -76, -101, 8, 2, 12, 3, -18, 55, -124, 97, 29, -123, -32, 52, 85, 109, 32, -123, -32, 52, -107, 109, 23, -120, -128, -104, 72, 67, 73, -75, -115, 12, 18, 21, 88, -123, 32, 32, -26, 49, 0, -61, 96, 31, 3, 67, 45, 22, 82, 8, 78, 83, -35, -58, 65, 8, 78, 83, -103, 73, 33, 56, 77, -91, -37, 9, 33, 0, -53, 98, 36, 4, 48, 12, 57, 0, 0, 0, 0, 0, 0, 97, 32, 0, 0, 3, 0, 0, 0, 19, 4, -63, -120, 1, 113, 4, 11, -128, 0, 0, 0, 97, 32, 0, 0, 13, 0, 0, 0, 19, 4, 65, 44, 16, 0, 0, 0, 2, 0, 0, 0, 84, -115, 0, -108, -1, 0, 0, 0, 35, 6, 6, 18, 56, -107, 117, 37, 22, 14, 4, 0, 3, 0, 0, 0, -122, 65, 8, -64, -78, 88, 69, 81, 1, 11, 69, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        return data;
    }

    private static byte[] getBitCode64Internal() {
        byte[] bc = new byte[bitCode64Length];
        int offset = 0;
        byte[] seg = format_convertBitCode.getSegment64_0();
        System.arraycopy((Object)seg, 0, (Object)bc, offset, seg.length);
        offset += seg.length;
        return bc;
    }
}
