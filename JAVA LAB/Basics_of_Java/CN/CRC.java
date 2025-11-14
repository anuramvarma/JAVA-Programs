import java.util.*;
class CRC{
    private static final int CRC12_INIT = 0x000;
    private static final int CRC16_INIT = 0x0000;
    private static final int CRCCCITT_INIT = 0xFFFF;
    static int crc12(byte[] data) {
        int crc = CRC12_INIT, poly = 0x180F;
        for (byte b : data) 
        {
            crc ^= (b & 0xFF) << 4;
            for (int i = 0; i < 8; i++)
                crc = ((crc & 0x800) != 0 ? (crc << 1) ^ poly : crc << 1) & 0xFFF;
        }
        return crc;
    }
    static int crc16(byte[] data) {
        int crc = CRC16_INIT, poly = 0x8005;
        for (byte b : data) {
            crc ^= (b & 0xFF) << 8;
            for (int i = 0; i < 8; i++)
                crc = (crc & 0x8000) != 0 ? (crc << 1) ^ poly : crc << 1;
        }
        return crc & 0xFFFF;
    }
    static int crcCCITT(byte[] data) {
        int crc = CRCCCITT_INIT, poly = 0x1021;
        for (byte b : data) {
            crc ^= (b & 0xFF) << 8;
            for (int i = 0; i < 8; i++)
                crc = (crc & 0x8000) != 0 ? (crc << 1) ^ poly : crc << 1;
        }
        return crc & 0xFFFF;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter data: ");
        byte[] bytes = sc.next().getBytes();
        System.out.printf("\nCRC-12:    0x%03X\n", crc12(bytes));
        System.out.printf("CRC-16:    0x%04X\n", crc16(bytes));
        System.out.printf("CRC-CCITT: 0x%04X\n", crcCCITT(bytes));
    }
}
