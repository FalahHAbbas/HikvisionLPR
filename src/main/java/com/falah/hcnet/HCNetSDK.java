//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.falah.hcnet;

import com.sun.jna.Callback;
import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.Union;
import com.sun.jna.platform.win32.User32;
import com.sun.jna.ptr.ByteByReference;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.NativeLongByReference;
import com.sun.jna.ptr.ShortByReference;
import java.util.Arrays;
import java.util.List;

public interface HCNetSDK extends Library {
    HCNetSDK INSTANCE = (HCNetSDK)Native.loadLibrary("hcnetsdk", HCNetSDK.class);
    int MAX_NAMELEN = 16;
    int MAX_RIGHT = 32;
    int NAME_LEN = 32;
    int PASSWD_LEN = 16;
    int SERIALNO_LEN = 48;
    int MACADDR_LEN = 6;
    int MAX_ETHERNET = 2;
    int PATHNAME_LEN = 128;
    int MAX_TIMESEGMENT_V30 = 8;
    int MAX_TIMESEGMENT = 4;
    int MAX_SHELTERNUM = 4;
    int MAX_DAYS = 7;
    int PHONENUMBER_LEN = 32;
    int MAX_DISKNUM_V30 = 33;
    int MAX_DISKNUM = 16;
    int MAX_DISKNUM_V10 = 8;
    int MAX_WINDOW_V30 = 32;
    int MAX_WINDOW = 16;
    int MAX_VGA_V30 = 4;
    int MAX_VGA = 1;
    int MAX_USERNUM_V30 = 32;
    int MAX_USERNUM = 16;
    int MAX_EXCEPTIONNUM_V30 = 32;
    int MAX_EXCEPTIONNUM = 16;
    int MAX_LINK = 6;
    int MAX_DECPOOLNUM = 4;
    int MAX_DECNUM = 4;
    int MAX_TRANSPARENTNUM = 2;
    int MAX_CYCLE_CHAN = 16;
    int MAX_DIRNAME_LENGTH = 80;
    int MAX_STRINGNUM_V30 = 8;
    int MAX_STRINGNUM = 4;
    int MAX_STRINGNUM_EX = 8;
    int MAX_AUXOUT_V30 = 16;
    int MAX_AUXOUT = 4;
    int MAX_HD_GROUP = 16;
    int MAX_NFS_DISK = 8;
    int IW_ESSID_MAX_SIZE = 32;
    int IW_ENCODING_TOKEN_MAX = 32;
    int MAX_SERIAL_NUM = 64;
    int MAX_DDNS_NUMS = 10;
    int MAX_DOMAIN_NAME = 64;
    int MAX_EMAIL_ADDR_LEN = 48;
    int MAX_EMAIL_PWD_LEN = 32;
    int MAXPROGRESS = 100;
    int MAX_SERIALNUM = 2;
    int CARDNUM_LEN = 20;
    int MAX_VIDEOOUT_V30 = 4;
    int MAX_VIDEOOUT = 2;
    int MAX_PRESET_V30 = 256;
    int MAX_TRACK_V30 = 256;
    int MAX_CRUISE_V30 = 256;
    int MAX_PRESET = 128;
    int MAX_TRACK = 128;
    int MAX_CRUISE = 128;
    int CRUISE_MAX_PRESET_NUMS = 32;
    int MAX_SERIAL_PORT = 8;
    int MAX_PREVIEW_MODE = 8;
    int MAX_MATRIXOUT = 16;
    int LOG_INFO_LEN = 11840;
    int DESC_LEN = 16;
    int PTZ_PROTOCOL_NUM = 200;
    int MAX_AUDIO = 1;
    int MAX_AUDIO_V30 = 2;
    int MAX_CHANNUM = 16;
    int MAX_ALARMIN = 16;
    int MAX_ALARMOUT = 4;
    int MAX_ANALOG_CHANNUM = 32;
    int MAX_ANALOG_ALARMOUT = 32;
    int MAX_ANALOG_ALARMIN = 32;
    int MAX_IP_DEVICE = 32;
    int MAX_IP_CHANNEL = 32;
    int MAX_IP_ALARMIN = 128;
    int MAX_IP_ALARMOUT = 64;
    int MAX_CHANNUM_V30 = 64;
    int MAX_ALARMOUT_V30 = 96;
    int MAX_ALARMIN_V30 = 160;
    int NET_DVR_NOERROR = 0;
    int NET_DVR_PASSWORD_ERROR = 1;
    int NET_DVR_NOENOUGHPRI = 2;
    int NET_DVR_NOINIT = 3;
    int NET_DVR_CHANNEL_ERROR = 4;
    int NET_DVR_OVER_MAXLINK = 5;
    int NET_DVR_VERSIONNOMATCH = 6;
    int NET_DVR_NETWORK_FAIL_CONNECT = 7;
    int NET_DVR_NETWORK_SEND_ERROR = 8;
    int NET_DVR_NETWORK_RECV_ERROR = 9;
    int NET_DVR_NETWORK_RECV_TIMEOUT = 10;
    int NET_DVR_NETWORK_ERRORDATA = 11;
    int NET_DVR_ORDER_ERROR = 12;
    int NET_DVR_OPERNOPERMIT = 13;
    int NET_DVR_COMMANDTIMEOUT = 14;
    int NET_DVR_ERRORSERIALPORT = 15;
    int NET_DVR_ERRORALARMPORT = 16;
    int NET_DVR_PARAMETER_ERROR = 17;
    int NET_DVR_CHAN_EXCEPTION = 18;
    int NET_DVR_NODISK = 19;
    int NET_DVR_ERRORDISKNUM = 20;
    int NET_DVR_DISK_FULL = 21;
    int NET_DVR_DISK_ERROR = 22;
    int NET_DVR_NOSUPPORT = 23;
    int NET_DVR_BUSY = 24;
    int NET_DVR_MODIFY_FAIL = 25;
    int NET_DVR_PASSWORD_FORMAT_ERROR = 26;
    int NET_DVR_DISK_FORMATING = 27;
    int NET_DVR_DVRNORESOURCE = 28;
    int NET_DVR_DVROPRATEFAILED = 29;
    int NET_DVR_OPENHOSTSOUND_FAIL = 30;
    int NET_DVR_DVRVOICEOPENED = 31;
    int NET_DVR_TIMEINPUTERROR = 32;
    int NET_DVR_NOSPECFILE = 33;
    int NET_DVR_CREATEFILE_ERROR = 34;
    int NET_DVR_FILEOPENFAIL = 35;
    int NET_DVR_OPERNOTFINISH = 36;
    int NET_DVR_GETPLAYTIMEFAIL = 37;
    int NET_DVR_PLAYFAIL = 38;
    int NET_DVR_FILEFORMAT_ERROR = 39;
    int NET_DVR_DIR_ERROR = 40;
    int NET_DVR_ALLOC_RESOURCE_ERROR = 41;
    int NET_DVR_AUDIO_MODE_ERROR = 42;
    int NET_DVR_NOENOUGH_BUF = 43;
    int NET_DVR_CREATESOCKET_ERROR = 44;
    int NET_DVR_SETSOCKET_ERROR = 45;
    int NET_DVR_MAX_NUM = 46;
    int NET_DVR_USERNOTEXIST = 47;
    int NET_DVR_WRITEFLASHERROR = 48;
    int NET_DVR_UPGRADEFAIL = 49;
    int NET_DVR_CARDHAVEINIT = 50;
    int NET_DVR_PLAYERFAILED = 51;
    int NET_DVR_MAX_USERNUM = 52;
    int NET_DVR_GETLOCALIPANDMACFAIL = 53;
    int NET_DVR_NOENCODEING = 54;
    int NET_DVR_IPMISMATCH = 55;
    int NET_DVR_MACMISMATCH = 56;
    int NET_DVR_UPGRADELANGMISMATCH = 57;
    int NET_DVR_MAX_PLAYERPORT = 58;
    int NET_DVR_NOSPACEBACKUP = 59;
    int NET_DVR_NODEVICEBACKUP = 60;
    int NET_DVR_PICTURE_BITS_ERROR = 61;
    int NET_DVR_PICTURE_DIMENSION_ERROR = 62;
    int NET_DVR_PICTURE_SIZ_ERROR = 63;
    int NET_DVR_LOADPLAYERSDKFAILED = 64;
    int NET_DVR_LOADPLAYERSDKPROC_ERROR = 65;
    int NET_DVR_LOADDSSDKFAILED = 66;
    int NET_DVR_LOADDSSDKPROC_ERROR = 67;
    int NET_DVR_DSSDK_ERROR = 68;
    int NET_DVR_VOICEMONOPOLIZE = 69;
    int NET_DVR_JOINMULTICASTFAILED = 70;
    int NET_DVR_CREATEDIR_ERROR = 71;
    int NET_DVR_BINDSOCKET_ERROR = 72;
    int NET_DVR_SOCKETCLOSE_ERROR = 73;
    int NET_DVR_USERID_ISUSING = 74;
    int NET_DVR_SOCKETLISTEN_ERROR = 75;
    int NET_DVR_PROGRAM_EXCEPTION = 76;
    int NET_DVR_WRITEFILE_FAILED = 77;
    int NET_DVR_FORMAT_READONLY = 78;
    int NET_DVR_WITHSAMEUSERNAME = 79;
    int NET_DVR_DEVICETYPE_ERROR = 80;
    int NET_DVR_LANGUAGE_ERROR = 81;
    int NET_DVR_PARAVERSION_ERROR = 82;
    int NET_DVR_IPCHAN_NOTALIVE = 83;
    int NET_DVR_RTSP_SDK_ERROR = 84;
    int NET_DVR_CONVERT_SDK_ERROR = 85;
    int NET_DVR_IPC_COUNT_OVERFLOW = 86;
    int NET_PLAYM4_NOERROR = 500;
    int NET_PLAYM4_PARA_OVER = 501;
    int NET_PLAYM4_ORDER_ERROR = 502;
    int NET_PLAYM4_TIMER_ERROR = 503;
    int NET_PLAYM4_DEC_VIDEO_ERROR = 504;
    int NET_PLAYM4_DEC_AUDIO_ERROR = 505;
    int NET_PLAYM4_ALLOC_MEMORY_ERROR = 506;
    int NET_PLAYM4_OPEN_FILE_ERROR = 507;
    int NET_PLAYM4_CREATE_OBJ_ERROR = 508;
    int NET_PLAYM4_CREATE_DDRAW_ERROR = 509;
    int NET_PLAYM4_CREATE_OFFSCREEN_ERROR = 510;
    int NET_PLAYM4_BUF_OVER = 511;
    int NET_PLAYM4_CREATE_SOUND_ERROR = 512;
    int NET_PLAYM4_SET_VOLUME_ERROR = 513;
    int NET_PLAYM4_SUPPORT_FILE_ONLY = 514;
    int NET_PLAYM4_SUPPORT_STREAM_ONLY = 515;
    int NET_PLAYM4_SYS_NOT_SUPPORT = 516;
    int NET_PLAYM4_FILEHEADER_UNKNOWN = 517;
    int NET_PLAYM4_VERSION_INCORRECT = 518;
    int NET_PALYM4_INIT_DECODER_ERROR = 519;
    int NET_PLAYM4_CHECK_FILE_ERROR = 520;
    int NET_PLAYM4_INIT_TIMER_ERROR = 521;
    int NET_PLAYM4_BLT_ERROR = 522;
    int NET_PLAYM4_UPDATE_ERROR = 523;
    int NET_PLAYM4_OPEN_FILE_ERROR_MULTI = 524;
    int NET_PLAYM4_OPEN_FILE_ERROR_VIDEO = 525;
    int NET_PLAYM4_JPEG_COMPRESS_ERROR = 526;
    int NET_PLAYM4_EXTRACT_NOT_SUPPORT = 527;
    int NET_PLAYM4_EXTRACT_DATA_ERROR = 528;
    int NET_DVR_SUPPORT_DDRAW = 1;
    int NET_DVR_SUPPORT_BLT = 2;
    int NET_DVR_SUPPORT_BLTFOURCC = 4;
    int NET_DVR_SUPPORT_BLTSHRINKX = 8;
    int NET_DVR_SUPPORT_BLTSHRINKY = 16;
    int NET_DVR_SUPPORT_BLTSTRETCHX = 32;
    int NET_DVR_SUPPORT_BLTSTRETCHY = 64;
    int NET_DVR_SUPPORT_SSE = 128;
    int NET_DVR_SUPPORT_MMX = 256;
    int LIGHT_PWRON = 2;
    int WIPER_PWRON = 3;
    int FAN_PWRON = 4;
    int HEATER_PWRON = 5;
    int AUX_PWRON1 = 6;
    int AUX_PWRON2 = 7;
    int SET_PRESET = 8;
    int CLE_PRESET = 9;
    int ZOOM_IN = 11;
    int ZOOM_OUT = 12;
    int FOCUS_NEAR = 13;
    int FOCUS_FAR = 14;
    int IRIS_OPEN = 15;
    int IRIS_CLOSE = 16;
    int TILT_UP = 21;
    int TILT_DOWN = 22;
    int PAN_LEFT = 23;
    int PAN_RIGHT = 24;
    int UP_LEFT = 25;
    int UP_RIGHT = 26;
    int DOWN_LEFT = 27;
    int DOWN_RIGHT = 28;
    int PAN_AUTO = 29;
    int FILL_PRE_SEQ = 30;
    int SET_SEQ_DWELL = 31;
    int SET_SEQ_SPEED = 32;
    int CLE_PRE_SEQ = 33;
    int STA_MEM_CRUISE = 34;
    int STO_MEM_CRUISE = 35;
    int RUN_CRUISE = 36;
    int RUN_SEQ = 37;
    int STOP_SEQ = 38;
    int GOTO_PRESET = 39;
    int DEL_SEQ = 43;
    int STOP_CRUISE = 44;
    int DELETE_CRUISE = 45;
    int DELETE_ALL_CRUISE = 46;
    int NET_DVR_CONTROL_PTZ_PATTERN = 3313;
    int NET_DVR_PLAYSTART = 1;
    int NET_DVR_PLAYSTOP = 2;
    int NET_DVR_PLAYPAUSE = 3;
    int NET_DVR_PLAYRESTART = 4;
    int NET_DVR_PLAYFAST = 5;
    int NET_DVR_PLAYSLOW = 6;
    int NET_DVR_PLAYNORMAL = 7;
    int NET_DVR_PLAYFRAME = 8;
    int NET_DVR_PLAYSTARTAUDIO = 9;
    int NET_DVR_PLAYSTOPAUDIO = 10;
    int NET_DVR_PLAYAUDIOVOLUME = 11;
    int NET_DVR_PLAYSETPOS = 12;
    int NET_DVR_PLAYGETPOS = 13;
    int NET_DVR_PLAYGETTIME = 14;
    int NET_DVR_PLAYGETFRAME = 15;
    int NET_DVR_GETTOTALFRAMES = 16;
    int NET_DVR_GETTOTALTIME = 17;
    int NET_DVR_THROWBFRAME = 20;
    int NET_DVR_SETSPEED = 24;
    int NET_DVR_KEEPALIVE = 25;
    int KEY_CODE_1 = 1;
    int KEY_CODE_2 = 2;
    int KEY_CODE_3 = 3;
    int KEY_CODE_4 = 4;
    int KEY_CODE_5 = 5;
    int KEY_CODE_6 = 6;
    int KEY_CODE_7 = 7;
    int KEY_CODE_8 = 8;
    int KEY_CODE_9 = 9;
    int KEY_CODE_0 = 10;
    int KEY_CODE_POWER = 11;
    int KEY_CODE_MENU = 12;
    int KEY_CODE_ENTER = 13;
    int KEY_CODE_CANCEL = 14;
    int KEY_CODE_UP = 15;
    int KEY_CODE_DOWN = 16;
    int KEY_CODE_LEFT = 17;
    int KEY_CODE_RIGHT = 18;
    int KEY_CODE_EDIT = 19;
    int KEY_CODE_ADD = 20;
    int KEY_CODE_MINUS = 21;
    int KEY_CODE_PLAY = 22;
    int KEY_CODE_REC = 23;
    int KEY_CODE_PAN = 24;
    int KEY_CODE_M = 25;
    int KEY_CODE_A = 26;
    int KEY_CODE_F1 = 27;
    int KEY_CODE_F2 = 28;
    int KEY_PTZ_UP_START = 15;
    int KEY_PTZ_UP_STO = 32;
    int KEY_PTZ_DOWN_START = 16;
    int KEY_PTZ_DOWN_STOP = 33;
    int KEY_PTZ_LEFT_START = 17;
    int KEY_PTZ_LEFT_STOP = 34;
    int KEY_PTZ_RIGHT_START = 18;
    int KEY_PTZ_RIGHT_STOP = 35;
    int KEY_PTZ_AP1_START = 19;
    int KEY_PTZ_AP1_STOP = 36;
    int KEY_PTZ_AP2_START = 24;
    int KEY_PTZ_AP2_STOP = 37;
    int KEY_PTZ_FOCUS1_START = 26;
    int KEY_PTZ_FOCUS1_STOP = 38;
    int KEY_PTZ_FOCUS2_START = 25;
    int KEY_PTZ_FOCUS2_STOP = 39;
    int KEY_PTZ_B1_START = 40;
    int KEY_PTZ_B1_STOP = 41;
    int KEY_PTZ_B2_START = 42;
    int KEY_PTZ_B2_STOP = 43;
    int KEY_CODE_11 = 44;
    int KEY_CODE_12 = 45;
    int KEY_CODE_13 = 46;
    int KEY_CODE_14 = 47;
    int KEY_CODE_15 = 48;
    int KEY_CODE_16 = 49;
    int NET_DVR_GET_DEVICECFG = 100;
    int NET_DVR_SET_DEVICECFG = 101;
    int NET_DVR_GET_NETCFG = 102;
    int NET_DVR_SET_NETCFG = 103;
    int NET_DVR_GET_PICCFG = 104;
    int NET_DVR_SET_PICCFG = 105;
    int NET_DVR_GET_COMPRESSCFG = 106;
    int NET_DVR_SET_COMPRESSCFG = 107;
    int NET_DVR_GET_RECORDCFG = 108;
    int NET_DVR_SET_RECORDCFG = 109;
    int NET_DVR_GET_DECODERCFG = 110;
    int NET_DVR_SET_DECODERCFG = 111;
    int NET_DVR_GET_RS232CFG = 112;
    int NET_DVR_SET_RS232CFG = 113;
    int NET_DVR_GET_ALARMINCFG = 114;
    int NET_DVR_SET_ALARMINCFG = 115;
    int NET_DVR_GET_ALARMOUTCFG = 116;
    int NET_DVR_SET_ALARMOUTCFG = 117;
    int NET_DVR_GET_TIMECFG = 118;
    int NET_DVR_SET_TIMECFG = 119;
    int NET_DVR_GET_PREVIEWCFG = 120;
    int NET_DVR_SET_PREVIEWCFG = 121;
    int NET_DVR_GET_VIDEOOUTCFG = 122;
    int NET_DVR_SET_VIDEOOUTCFG = 123;
    int NET_DVR_GET_USERCFG = 124;
    int NET_DVR_SET_USERCFG = 125;
    int NET_DVR_GET_EXCEPTIONCFG = 126;
    int NET_DVR_SET_EXCEPTIONCFG = 127;
    int NET_DVR_GET_ZONEANDDST = 128;
    int NET_DVR_SET_ZONEANDDST = 129;
    int NET_DVR_GET_SHOWSTRING = 130;
    int NET_DVR_SET_SHOWSTRING = 131;
    int NET_DVR_GET_EVENTCOMPCFG = 132;
    int NET_DVR_SET_EVENTCOMPCFG = 133;
    int NET_DVR_GET_AUXOUTCFG = 140;
    int NET_DVR_SET_AUXOUTCFG = 141;
    int NET_DVR_GET_PREVIEWCFG_AUX = 142;
    int NET_DVR_SET_PREVIEWCFG_AUX = 143;
    int NET_DVR_GET_PICCFG_EX = 200;
    int NET_DVR_SET_PICCFG_EX = 201;
    int NET_DVR_GET_USERCFG_EX = 202;
    int NET_DVR_SET_USERCFG_EX = 203;
    int NET_DVR_GET_COMPRESSCFG_EX = 204;
    int NET_DVR_SET_COMPRESSCFG_EX = 205;
    int NET_DVR_GET_NETAPPCFG = 222;
    int NET_DVR_SET_NETAPPCFG = 223;
    int NET_DVR_GET_NTPCFG = 224;
    int NET_DVR_SET_NTPCFG = 225;
    int NET_DVR_GET_DDNSCFG = 226;
    int NET_DVR_SET_DDNSCFG = 227;
    int NET_DVR_GET_DEVICECFG_V40 = 1100;
    int NET_DVR_GET_AUDIO_INPUT = 3201;
    int NET_DVR_SET_AUDIO_INPUT = 3202;
    int NET_DVR_GET_EMAILCFG = 228;
    int NET_DVR_SET_EMAILCFG = 229;
    int NET_DVR_GET_NFSCFG = 230;
    int NET_DVR_SET_NFSCFG = 231;
    int NET_DVR_GET_SHOWSTRING_EX = 238;
    int NET_DVR_SET_SHOWSTRING_EX = 239;
    int NET_DVR_GET_NETCFG_OTHER = 244;
    int NET_DVR_SET_NETCFG_OTHER = 245;
    int NET_DVR_GET_EMAILPARACFG = 250;
    int NET_DVR_SET_EMAILPARACFG = 251;
    int NET_DVR_GET_DDNSCFG_EX = 274;
    int NET_DVR_SET_DDNSCFG_EX = 275;
    int NET_DVR_SET_PTZPOS = 292;
    int NET_DVR_GET_PTZPOS = 293;
    int NET_DVR_GET_PTZSCOPE = 294;
    int NET_DVR_GET_MULTI_STREAM_COMPRESSIONCFG = 3216;
    int NET_DVR_SET_MULTI_STREAM_COMPRESSIONCFG = 3217;
    int NET_DVR_GET_NETCFG_V30 = 1000;
    int NET_DVR_SET_NETCFG_V30 = 1001;
    int NET_DVR_GET_PICCFG_V30 = 1002;
    int NET_DVR_SET_PICCFG_V30 = 1003;
    int NET_DVR_GET_RECORDCFG_V30 = 1004;
    int NET_DVR_SET_RECORDCFG_V30 = 1005;
    int NET_DVR_GET_USERCFG_V30 = 1006;
    int NET_DVR_SET_USERCFG_V30 = 1007;
    int NET_DVR_GET_DDNSCFG_V30 = 1010;
    int NET_DVR_SET_DDNSCFG_V30 = 1011;
    int NET_DVR_GET_EMAILCFG_V30 = 1012;
    int NET_DVR_SET_EMAILCFG_V30 = 1013;
    int NET_DVR_GET_CRUISE = 1020;
    int NET_DVR_SET_CRUISE = 1021;
    int NET_DVR_GET_ALARMINCFG_V30 = 1024;
    int NET_DVR_SET_ALARMINCFG_V30 = 1025;
    int NET_DVR_GET_ALARMOUTCFG_V30 = 1026;
    int NET_DVR_SET_ALARMOUTCFG_V30 = 1027;
    int NET_DVR_GET_VIDEOOUTCFG_V30 = 1028;
    int NET_DVR_SET_VIDEOOUTCFG_V30 = 1029;
    int NET_DVR_GET_SHOWSTRING_V30 = 1030;
    int NET_DVR_SET_SHOWSTRING_V30 = 1031;
    int NET_DVR_GET_EXCEPTIONCFG_V30 = 1034;
    int NET_DVR_SET_EXCEPTIONCFG_V30 = 1035;
    int NET_DVR_GET_RS232CFG_V30 = 1036;
    int NET_DVR_SET_RS232CFG_V30 = 1037;
    int NET_DVR_GET_COMPRESSCFG_V30 = 1040;
    int NET_DVR_SET_COMPRESSCFG_V30 = 1041;
    int NET_DVR_GET_DECODERCFG_V30 = 1042;
    int NET_DVR_SET_DECODERCFG_V30 = 1043;
    int NET_DVR_GET_PREVIEWCFG_V30 = 1044;
    int NET_DVR_SET_PREVIEWCFG_V30 = 1045;
    int NET_DVR_GET_PREVIEWCFG_AUX_V30 = 1046;
    int NET_DVR_SET_PREVIEWCFG_AUX_V30 = 1047;
    int NET_DVR_GET_IPPARACFG = 1048;
    int NET_DVR_SET_IPPARACFG = 1049;
    int NET_DVR_GET_IPALARMINCFG = 1050;
    int NET_DVR_SET_IPALARMINCFG = 1051;
    int NET_DVR_GET_IPALARMOUTCFG = 1052;
    int NET_DVR_SET_IPALARMOUTCFG = 1053;
    int NET_DVR_GET_HDCFG = 1054;
    int NET_DVR_SET_HDCFG = 1055;
    int NET_DVR_GET_HDGROUP_CFG = 1056;
    int NET_DVR_SET_HDGROUP_CFG = 1057;
    int NET_DVR_GET_COMPRESSCFG_AUD = 1058;
    int NET_DVR_SET_COMPRESSCFG_AUD = 1059;
    int NET_DVR_GET_ISP_CAMERAPARAMCFG = 3255;
    int NET_DVR_SET_ISP_CAMERAPARAMCFG = 3256;
    int NET_DVR_FILE_SUCCESS = 1000;
    int NET_DVR_FILE_NOFIND = 1001;
    int NET_DVR_ISFINDING = 1002;
    int NET_DVR_NOMOREFILE = 1003;
    int NET_DVR_FILE_EXCEPTION = 1004;
    int COMM_ALARM = 4352;
    int COMM_TRADEINFO = 5376;
    int COMM_ALARM_V30 = 16384;
    int COMM_ALARM_V40 = 16391;
    int COMM_IPCCFG = 16385;
    int COMM_ALARM_PDC = 4355;
    int COMM_UPLOAD_PLATE_RESULT = 10240;
    int COMM_ID_INFO_ALARM = 20992;
    int COMM_UPLOAD_FACESNAP_RESULT = 4370;
    int EXCEPTION_EXCHANGE = 32768;
    int EXCEPTION_AUDIOEXCHANGE = 32769;
    int EXCEPTION_ALARM = 32770;
    int EXCEPTION_PREVIEW = 32771;
    int EXCEPTION_SERIAL = 32772;
    int EXCEPTION_RECONNECT = 32773;
    int EXCEPTION_ALARMRECONNECT = 32774;
    int EXCEPTION_SERIALRECONNECT = 32775;
    int EXCEPTION_PLAYBACK = 32784;
    int EXCEPTION_DISKFMT = 32785;
    int NET_DVR_SYSHEAD = 1;
    int NET_DVR_STREAMDATA = 2;
    int NET_DVR_AUDIOSTREAMDATA = 3;
    int NET_DVR_STD_VIDEODATA = 4;
    int NET_DVR_STD_AUDIODATA = 5;
    int NET_DVR_REALPLAYEXCEPTION = 111;
    int NET_DVR_REALPLAYNETCLOSE = 112;
    int NET_DVR_REALPLAY5SNODATA = 113;
    int NET_DVR_REALPLAYRECONNECT = 114;
    int NET_DVR_PLAYBACKOVER = 101;
    int NET_DVR_PLAYBACKEXCEPTION = 102;
    int NET_DVR_PLAYBACKNETCLOSE = 103;
    int NET_DVR_PLAYBACK5SNODATA = 104;
    int DVR = 1;
    int ATMDVR = 2;
    int DVS = 3;
    int DEC = 4;
    int ENC_DEC = 5;
    int DVR_HC = 6;
    int DVR_HT = 7;
    int DVR_HF = 8;
    int DVR_HS = 9;
    int DVR_HTS = 10;
    int DVR_HB = 11;
    int DVR_HCS = 12;
    int DVS_A = 13;
    int DVR_HC_S = 14;
    int DVR_HT_S = 15;
    int DVR_HF_S = 16;
    int DVR_HS_S = 17;
    int ATMDVR_S = 18;
    int LOWCOST_DVR = 19;
    int DEC_MAT = 20;
    int DVR_MOBILE = 21;
    int DVR_HD_S = 22;
    int DVR_HD_SL = 23;
    int DVR_HC_SL = 24;
    int DVR_HS_ST = 25;
    int DVS_HW = 26;
    int IPCAM = 30;
    int MEGA_IPCAM = 31;
    int IPCAM_X62MF = 32;
    int IPDOME = 40;
    int MEGA_IPDOME = 41;
    int IPMOD = 50;
    int DS71XX_H = 71;
    int DS72XX_H_S = 72;
    int DS73XX_H_S = 73;
    int DS81XX_HS_S = 81;
    int DS81XX_HL_S = 82;
    int DS81XX_HC_S = 83;
    int DS81XX_HD_S = 84;
    int DS81XX_HE_S = 85;
    int DS81XX_HF_S = 86;
    int DS81XX_AH_S = 87;
    int DS81XX_AHF_S = 88;
    int DS90XX_HF_S = 90;
    int DS91XX_HF_S = 91;
    int DS91XX_HD_S = 92;
    int MAJOR_OPERATION = 3;
    int MAJOR_EVENT = 5;
    int MINOR_START_DVR = 65;
    int MINOR_STOP_DVR = 66;
    int MINOR_STOP_ABNORMAL = 67;
    int MINOR_REBOOT_DVR = 68;
    int MINOR_LOCAL_LOGIN = 80;
    int MINOR_LOCAL_LOGOUT = 81;
    int MINOR_LOCAL_CFG_PARM = 82;
    int MINOR_LOCAL_PLAYBYFILE = 83;
    int MINOR_LOCAL_PLAYBYTIME = 84;
    int MINOR_LOCAL_START_REC = 85;
    int MINOR_LOCAL_STOP_REC = 86;
    int MINOR_LOCAL_PTZCTRL = 87;
    int MINOR_LOCAL_PREVIEW = 88;
    int MINOR_LOCAL_MODIFY_TIME = 89;
    int MINOR_LOCAL_UPGRADE = 90;
    int MINOR_LOCAL_RECFILE_OUTPUT = 91;
    int MINOR_LOCAL_FORMAT_HDD = 92;
    int MINOR_LOCAL_CFGFILE_OUTPUT = 93;
    int MINOR_LOCAL_CFGFILE_INPUT = 94;
    int MINOR_LOCAL_COPYFILE = 95;
    int MINOR_LOCAL_LOCKFILE = 96;
    int MINOR_LOCAL_UNLOCKFILE = 97;
    int MINOR_LOCAL_DVR_ALARM = 98;
    int MINOR_IPC_ADD = 99;
    int MINOR_IPC_DEL = 100;
    int MINOR_IPC_SET = 101;
    int MINOR_LOCAL_START_BACKUP = 102;
    int MINOR_LOCAL_STOP_BACKUP = 103;
    int MINOR_LOCAL_COPYFILE_START_TIME = 104;
    int MINOR_LOCAL_COPYFILE_END_TIME = 105;
    int MINOR_REMOTE_LOGIN = 112;
    int MINOR_REMOTE_LOGOUT = 113;
    int MINOR_REMOTE_START_REC = 114;
    int MINOR_REMOTE_STOP_REC = 115;
    int MINOR_START_TRANS_CHAN = 116;
    int MINOR_STOP_TRANS_CHAN = 117;
    int MINOR_REMOTE_GET_PARM = 118;
    int MINOR_REMOTE_CFG_PARM = 119;
    int MINOR_REMOTE_GET_STATUS = 120;
    int MINOR_REMOTE_ARM = 121;
    int MINOR_REMOTE_DISARM = 122;
    int MINOR_REMOTE_REBOOT = 123;
    int MINOR_START_VT = 124;
    int MINOR_STOP_VT = 125;
    int MINOR_REMOTE_UPGRADE = 126;
    int MINOR_REMOTE_PLAYBYFILE = 127;
    int MINOR_REMOTE_PLAYBYTIME = 128;
    int MINOR_REMOTE_PTZCTRL = 129;
    int MINOR_REMOTE_FORMAT_HDD = 130;
    int MINOR_REMOTE_STOP = 131;
    int MINOR_REMOTE_LOCKFILE = 132;
    int MINOR_REMOTE_UNLOCKFILE = 133;
    int MINOR_REMOTE_CFGFILE_OUTPUT = 134;
    int MINOR_REMOTE_CFGFILE_INTPUT = 135;
    int MINOR_REMOTE_RECFILE_OUTPUT = 136;
    int MINOR_REMOTE_DVR_ALARM = 137;
    int MINOR_REMOTE_IPC_ADD = 138;
    int MINOR_REMOTE_IPC_DEL = 139;
    int MINOR_REMOTE_IPC_SET = 140;
    int MINOR_REBOOT_VCA_LIB = 141;
    int MAJOR_INFORMATION = 4;
    int MINOR_HDD_INFO = 161;
    int MINOR_SMART_INFO = 162;
    int MINOR_REC_START = 163;
    int MINOR_REC_STOP = 164;
    int MINOR_REC_OVERDUE = 165;
    int MINOR_LINK_START = 166;
    int MINOR_LINK_STOP = 167;
    int MINOR_NET_DISK_INFO = 168;
    int MINOR_RAID_INFO = 169;
    int MINOR_RUN_STATUS_INFO = 170;
    int PARA_VIDEOOUT = 1;
    int PARA_IMAGE = 2;
    int PARA_ENCODE = 4;
    int PARA_NETWORK = 8;
    int PARA_ALARM = 16;
    int PARA_EXCEPTION = 32;
    int PARA_DECODER = 64;
    int PARA_RS232 = 128;
    int PARA_PREVIEW = 256;
    int PARA_SECURITY = 512;
    int PARA_DATETIME = 1024;
    int PARA_FRAMETYPE = 2048;
    int PARA_VCA_RULE = 4096;
    int MAJOR_EXCEPTION = 2;
    int MINOR_RAID_ERROR = 32;
    int MINOR_VI_LOST = 33;
    int MINOR_ILLEGAL_ACCESS = 34;
    int MINOR_HD_FULL = 35;
    int MINOR_HD_ERROR = 36;
    int MINOR_DCD_LOST = 37;
    int MINOR_IP_CONFLICT = 38;
    int MINOR_NET_BROKEN = 39;
    int MINOR_REC_ERROR = 40;
    int MINOR_IPC_NO_LINK = 41;
    int MINOR_VI_EXCEPTION = 42;
    int MINOR_IPC_IP_CONFLICT = 43;
    int MINOR_SENCE_EXCEPTION = 44;
    int MAJOR_ALARM = 1;
    int MINOR_ALARM_IN = 1;
    int MINOR_ALARM_OUT = 2;
    int MINOR_MOTDET_START = 3;
    int MINOR_MOTDET_STOP = 4;
    int MINOR_HIDE_ALARM_START = 5;
    int MINOR_HIDE_ALARM_STOP = 6;
    int MINOR_VCA_ALARM_START = 7;
    int MINOR_VCA_ALARM_STOP = 8;
    int MINOR_ITS_ALARM_START = 9;
    int MINOR_ITS_ALARM_STOP = 10;
    int MINOR_NETALARM_START = 11;
    int MINOR_NETALARM_STOP = 12;
    int MINOR_NETALARM_RESUME = 13;
    int MINOR_WIRELESS_ALARM_START = 14;
    int MINOR_WIRELESS_ALARM_STOP = 15;
    int MINOR_PIR_ALARM_START = 16;
    int MINOR_PIR_ALARM_STOP = 17;
    int MINOR_CALLHELP_ALARM_START = 18;
    int MINOR_CALLHELP_ALARM_STOP = 19;
    int MINOR_IPCHANNEL_ALARMIN_START = 20;
    int MINOR_IPCHANNEL_ALARMIN_STOP = 21;
    int MINOR_DETECTFACE_ALARM_START = 22;
    int MINOR_DETECTFACE_ALARM_STOP = 23;
    int MINOR_VQD_ALARM_START = 24;
    int MINOR_VQD_ALARM_STOP = 25;
    int MINOR_VCA_SECNECHANGE_DETECTION = 26;
    int MINOR_SMART_REGION_EXITING_BEGIN = 27;
    int MINOR_SMART_REGION_EXITING_END = 28;
    int MINOR_SMART_LOITERING_BEGIN = 29;
    int MINOR_SMART_LOITERING_END = 30;
    int MINOR_VCA_ALARM_LINE_DETECTION_BEGIN = 32;
    int MINOR_VCA_ALARM_LINE_DETECTION_END = 33;
    int MINOR_VCA_ALARM_INTRUDE_BEGIN = 34;
    int MINOR_VCA_ALARM_INTRUDE_END = 35;
    int MINOR_VCA_ALARM_AUDIOINPUT = 36;
    int MINOR_VCA_ALARM_AUDIOABNORMAL = 37;
    int MINOR_VCA_DEFOCUS_DETECTION_BEGIN = 38;
    int MINOR_VCA_DEFOCUS_DETECTION_END = 39;
    int MINOR_EXT_ALARM = 40;
    int MINOR_VCA_FACE_ALARM_BEGIN = 41;
    int MINOR_SMART_REGION_ENTRANCE_BEGIN = 42;
    int MINOR_SMART_REGION_ENTRANCE_END = 43;
    int MINOR_SMART_PEOPLE_GATHERING_BEGIN = 44;
    int MINOR_SMART_PEOPLE_GATHERING_END = 45;
    int MINOR_SMART_FAST_MOVING_BEGIN = 46;
    int MINOR_SMART_FAST_MOVING_END = 47;
    int MINOR_VCA_FACE_ALARM_END = 48;
    int MINOR_VCA_SCENE_CHANGE_ALARM_BEGIN = 49;
    int MINOR_VCA_SCENE_CHANGE_ALARM_END = 50;
    int MINOR_VCA_ALARM_AUDIOINPUT_BEGIN = 51;
    int MINOR_VCA_ALARM_AUDIOINPUT_END = 52;
    int MINOR_VCA_ALARM_AUDIOABNORMAL_BEGIN = 53;
    int MINOR_VCA_ALARM_AUDIOABNORMAL_END = 54;
    int MINOR_VCA_LECTURE_DETECTION_BEGIN = 55;
    int MINOR_VCA_LECTURE_DETECTION_END = 56;
    int MINOR_VCA_ALARM_AUDIOSTEEPDROP = 57;
    int MINOR_VCA_ANSWER_DETECTION_BEGIN = 58;
    int MINOR_VCA_ANSWER_DETECTION_END = 59;
    int MINOR_SMART_PARKING_BEGIN = 60;
    int MINOR_SMART_PARKING_END = 61;
    int MINOR_SMART_UNATTENDED_BAGGAGE_BEGIN = 62;
    int MINOR_SMART_UNATTENDED_BAGGAGE_END = 63;
    int MINOR_SMART_OBJECT_REMOVAL_BEGIN = 64;
    int MINOR_SMART_OBJECT_REMOVAL_END = 65;
    int MINOR_SMART_VEHICLE_ALARM_START = 70;
    int MINOR_SMART_VEHICLE_ALARM_STOP = 71;
    int MINOR_THERMAL_FIREDETECTION = 72;
    int MINOR_THERMAL_FIREDETECTION_END = 73;
    int MINOR_SMART_VANDALPROOF_BEGIN = 80;
    int MINOR_SMART_VANDALPROOF_END = 81;
    int MINOR_ALARMIN_SHORT_CIRCUIT = 1024;
    int MINOR_ALARMIN_BROKEN_CIRCUIT = 1025;
    int MINOR_ALARMIN_EXCEPTION = 1026;
    int MINOR_ALARMIN_RESUME = 1027;
    int MINOR_HOST_DESMANTLE_ALARM = 1028;
    int MINOR_HOST_DESMANTLE_RESUME = 1029;
    int MINOR_CARD_READER_DESMANTLE_ALARM = 1030;
    int MINOR_CARD_READER_DESMANTLE_RESUME = 1031;
    int MINOR_CASE_SENSOR_ALARM = 1032;
    int MINOR_CASE_SENSOR_RESUME = 1033;
    int MINOR_STRESS_ALARM = 1034;
    int MINOR_OFFLINE_ECENT_NEARLY_FULL = 1035;
    int MINOR_CARD_MAX_AUTHENTICATE_FAIL = 1036;
    int MINOR_SD_CARD_FULL = 1037;
    int MINOR_LINKAGE_CAPTURE_PIC = 1038;
    int DS6001_HF_B = 60;
    int DS6001_HF_P = 61;
    int DS6002_HF_B = 62;
    int DS6101_HF_B = 63;
    int IVMS_2000 = 64;
    int DS9000_IVS = 65;
    int DS8004_AHL_A = 66;
    int DS6101_HF_P = 67;
    int VCA_DEV_ABILITY = 256;
    int VCA_CHAN_ABILITY = 272;
    int NET_DVR_SET_PLATECFG = 150;
    int NET_DVR_GET_PLATECFG = 151;
    int NET_DVR_SET_RULECFG = 152;
    int NET_DVR_GET_RULECFG = 153;
    int NET_DVR_SET_LF_CFG = 160;
    int NET_DVR_GET_LF_CFG = 161;
    int NET_DVR_SET_IVMS_STREAMCFG = 162;
    int NET_DVR_GET_IVMS_STREAMCFG = 163;
    int NET_DVR_SET_VCA_CTRLCFG = 164;
    int NET_DVR_GET_VCA_CTRLCFG = 165;
    int NET_DVR_SET_VCA_MASK_REGION = 166;
    int NET_DVR_GET_VCA_MASK_REGION = 167;
    int NET_DVR_SET_VCA_ENTER_REGION = 168;
    int NET_DVR_GET_VCA_ENTER_REGION = 169;
    int NET_DVR_SET_VCA_LINE_SEGMENT = 170;
    int NET_DVR_GET_VCA_LINE_SEGMENT = 171;
    int NET_DVR_SET_IVMS_MASK_REGION = 172;
    int NET_DVR_GET_IVMS_MASK_REGION = 173;
    int NET_DVR_SET_IVMS_ENTER_REGION = 174;
    int NET_DVR_GET_IVMS_ENTER_REGION = 175;
    int NET_DVR_SET_IVMS_BEHAVIORCFG = 176;
    int NET_DVR_GET_IVMS_BEHAVIORCFG = 177;
    int NET_ITC_GET_TRIGGERCFG = 3003;
    int NET_ITC_SET_TRIGGERCFG = 3004;
    int STREAM_ID_LEN = 32;
    int NET_DVR_DEV_ADDRESS_MAX_LEN = 129;
    int NET_DVR_LOGIN_USERNAME_MAX_LEN = 64;
    int NET_DVR_LOGIN_PASSWD_MAX_LEN = 64;
    int CARDNUM_LEN_OUT = 32;
    int GUID_LEN = 16;
    int MAX_IOSPEED_GROUP_NUM = 4;
    int MAX_CHJC_NUM = 3;
    int MAX_INTERVAL_NUM = 4;
    int MAX_IOOUT_NUM = 4;
    int MAX_LANEAREA_NUM = 2;
    int ITC_MAX_POLYGON_POINT_NUM = 20;
    int MAX_LICENSE_LEN = 16;
    int MAX_AUDIO_V40 = 8;
    int DEV_ID_LEN = 32;
    int MAX_IP_DEVICE_V40 = 64;
    int MAX_DEVICES = 512;
    int MAX_CHANNUM_V40 = 512;
    int ALARM_INFO_T = 0;
    int OPERATION_SUCC_T = 1;
    int OPERATION_FAIL_T = 2;
    int PLAY_SUCC_T = 3;
    int PLAY_FAIL_T = 4;

    boolean NET_DVR_Init();

    boolean NET_DVR_SetSDKInitCfg(int var1, Pointer var2);

    boolean NET_DVR_Cleanup();

    boolean NET_DVR_SetDVRMessage(int var1, int var2);

    boolean NET_DVR_SetExceptionCallBack_V30(int var1, int var2, FExceptionCallBack var3, Pointer var4);

    boolean NET_DVR_SetDVRMessCallBack(FMessCallBack var1);

    boolean NET_DVR_SetDVRMessCallBack_EX(FMessCallBack_EX var1);

    boolean NET_DVR_SetDVRMessCallBack_NEW(FMessCallBack_NEW var1);

    boolean NET_DVR_SetDVRMessageCallBack(FMessageCallBack var1, int var2);

    boolean NET_DVR_SetDVRMessageCallBack_V30(FMSGCallBack var1, Pointer var2);

    boolean NET_DVR_SetConnectTime(int var1, int var2);

    boolean NET_DVR_SetReconnect(int var1, boolean var2);

    int NET_DVR_GetSDKVersion();

    int NET_DVR_GetSDKBuildVersion();

    int NET_DVR_IsSupport();

    boolean NET_DVR_StartListen(String var1, short var2);

    boolean NET_DVR_StopListen();

    NativeLong NET_DVR_StartListen_V30(String var1, short var2, FMSGCallBack var3, Pointer var4);

    boolean NET_DVR_StopListen_V30(NativeLong var1);

    NativeLong NET_DVR_Login(String var1, short var2, String var3, String var4, NET_DVR_DEVICEINFO var5);

    NativeLong NET_DVR_Login_V30(String var1, short var2, String var3, String var4, NET_DVR_DEVICEINFO_V30 var5);

    NativeLong NET_DVR_Login_V40(Pointer var1, Pointer var2);

    boolean NET_DVR_Logout(NativeLong var1);

    boolean NET_DVR_Logout_V30(NativeLong var1);

    int NET_DVR_GetLastError();

    String NET_DVR_GetErrorMsg(NativeLongByReference var1);

    boolean NET_DVR_SetShowMode(int var1, int var2);

    boolean NET_DVR_GetDVRIPByResolveSvr(String var1, short var2, String var3, short var4, String var5, short var6, String var7);

    boolean NET_DVR_GetDVRIPByResolveSvr_EX(String var1, short var2, String var3, short var4, String var5, short var6, String var7, IntByReference var8);

    NativeLong NET_DVR_RealPlay(NativeLong var1, NET_DVR_CLIENTINFO var2);

    NativeLong NET_DVR_RealPlay_V30(NativeLong var1, NET_DVR_CLIENTINFO var2, FRealDataCallBack_V30 var3, Pointer var4, boolean var5);

    NativeLong NET_DVR_RealPlay_V40(NativeLong var1, NET_DVR_PREVIEWINFO var2, FRealDataCallBack_V30 var3, Pointer var4);

    boolean NET_DVR_StopRealPlay(NativeLong var1);

    boolean NET_DVR_RigisterDrawFun(NativeLong var1, FDrawFun var2, int var3);

    boolean NET_DVR_SetPlayerBufNumber(NativeLong var1, int var2);

    boolean NET_DVR_ThrowBFrame(NativeLong var1, int var2);

    boolean NET_DVR_SetAudioMode(int var1);

    boolean NET_DVR_OpenSound(NativeLong var1);

    boolean NET_DVR_CloseSound();

    boolean NET_DVR_OpenSoundShare(NativeLong var1);

    boolean NET_DVR_CloseSoundShare(NativeLong var1);

    boolean NET_DVR_Volume(NativeLong var1, short var2);

    boolean NET_DVR_SaveRealData(NativeLong var1, String var2);

    boolean NET_DVR_StopSaveRealData(NativeLong var1);

    boolean NET_DVR_SetRealDataCallBack(NativeLong var1, FRowDataCallBack var2, int var3);

    boolean NET_DVR_SetStandardDataCallBack(NativeLong var1, FStdDataCallBack var2, int var3);

    boolean NET_DVR_CapturePicture(NativeLong var1, String var2);

    boolean NET_DVR_MakeKeyFrame(NativeLong var1, NativeLong var2);

    boolean NET_DVR_MakeKeyFrameSub(NativeLong var1, NativeLong var2);

    boolean NET_DVR_PTZControl(NativeLong var1, int var2, int var3);

    boolean NET_DVR_PTZControl_Other(NativeLong var1, NativeLong var2, int var3, int var4);

    boolean NET_DVR_TransPTZ(NativeLong var1, String var2, int var3);

    boolean NET_DVR_TransPTZ_Other(NativeLong var1, NativeLong var2, String var3, int var4);

    boolean NET_DVR_PTZPreset(NativeLong var1, int var2, int var3);

    boolean NET_DVR_PTZPreset_Other(NativeLong var1, NativeLong var2, int var3, int var4);

    boolean NET_DVR_TransPTZ_EX(NativeLong var1, String var2, int var3);

    boolean NET_DVR_PTZControl_EX(NativeLong var1, int var2, int var3);

    boolean NET_DVR_PTZPreset_EX(NativeLong var1, int var2, int var3);

    boolean NET_DVR_PTZCruise(NativeLong var1, int var2, byte var3, byte var4, short var5);

    boolean NET_DVR_PTZCruise_Other(NativeLong var1, NativeLong var2, int var3, byte var4, byte var5, short var6);

    boolean NET_DVR_PTZCruise_EX(NativeLong var1, int var2, byte var3, byte var4, short var5);

    boolean NET_DVR_PTZTrack(NativeLong var1, int var2);

    boolean NET_DVR_PTZTrack_Other(NativeLong var1, NativeLong var2, int var3);

    boolean NET_DVR_PTZTrack_EX(NativeLong var1, int var2);

    boolean NET_DVR_PTZControlWithSpeed(NativeLong var1, int var2, int var3, int var4);

    boolean NET_DVR_PTZControlWithSpeed_Other(NativeLong var1, NativeLong var2, int var3, int var4, int var5);

    boolean NET_DVR_PTZControlWithSpeed_EX(NativeLong var1, int var2, int var3, int var4);

    boolean NET_DVR_GetPTZCruise(NativeLong var1, NativeLong var2, NativeLong var3, NET_DVR_CRUISE_RET var4);

    boolean NET_DVR_PTZMltTrack(NativeLong var1, int var2, int var3);

    boolean NET_DVR_PTZMltTrack_Other(NativeLong var1, NativeLong var2, int var3, int var4);

    boolean NET_DVR_PTZMltTrack_EX(NativeLong var1, int var2, int var3);

    boolean NET_DVR_RemoteControl(NativeLong var1, int var2, Pointer var3, int var4);

    NativeLong NET_DVR_FindFile(NativeLong var1, NativeLong var2, int var3, NET_DVR_TIME var4, NET_DVR_TIME var5);

    NativeLong NET_DVR_FindNextFile(NativeLong var1, NET_DVR_FIND_DATA var2);

    boolean NET_DVR_FindClose(NativeLong var1);

    NativeLong NET_DVR_FindNextFile_V30(NativeLong var1, NET_DVR_FINDDATA_V30 var2);

    NativeLong NET_DVR_FindFile_V30(NativeLong var1, NET_DVR_FILECOND var2);

    boolean NET_DVR_FindClose_V30(NativeLong var1);

    NativeLong NET_DVR_FindFile_V40(NativeLong var1, NET_DVR_FILECOND_V40 var2);

    NativeLong NET_DVR_FindNextFile_V40(NativeLong var1, NET_DVR_FINDDATA_V40 var2);

    NativeLong NET_DVR_FindNextFile_Card(NativeLong var1, NET_DVR_FINDDATA_CARD var2);

    NativeLong NET_DVR_FindFile_Card(NativeLong var1, NativeLong var2, int var3, NET_DVR_TIME var4, NET_DVR_TIME var5);

    boolean NET_DVR_LockFileByName(NativeLong var1, String var2);

    boolean NET_DVR_UnlockFileByName(NativeLong var1, String var2);

    NativeLong NET_DVR_PlayBackByName(NativeLong var1, String var2, User32.HWND var3);

    NativeLong NET_DVR_PlayBackReverseByName(NativeLong var1, String var2, User32.HWND var3);

    NativeLong NET_DVR_PlayBackByTime(NativeLong var1, NativeLong var2, NET_DVR_TIME var3, NET_DVR_TIME var4, User32.HWND var5);

    NativeLong NET_DVR_PlayBackByTime_V40(NativeLong var1, NET_DVR_VOD_PARA var2);

    NativeLong NET_DVR_PlayBackReverseByTime_V40(NativeLong var1, User32.HWND var2, NET_DVR_PLAYCOND var3);

    boolean NET_DVR_PlayBackControl(NativeLong var1, int var2, int var3, IntByReference var4);

    boolean NET_DVR_PlayBackControl_V40(NativeLong var1, int var2, Pointer var3, int var4, Pointer var5, IntByReference var6);

    boolean NET_DVR_StopPlayBack(NativeLong var1);

    boolean NET_DVR_SetPlayDataCallBack(NativeLong var1, FPlayDataCallBack var2, int var3);

    boolean NET_DVR_PlayBackSaveData(NativeLong var1, String var2);

    boolean NET_DVR_StopPlayBackSave(NativeLong var1);

    boolean NET_DVR_GetPlayBackOsdTime(NativeLong var1, NET_DVR_TIME var2);

    boolean NET_DVR_PlayBackCaptureFile(NativeLong var1, String var2);

    NativeLong NET_DVR_GetFileByName(NativeLong var1, String var2, String var3);

    NativeLong NET_DVR_GetFileByTime(NativeLong var1, NativeLong var2, NET_DVR_TIME var3, NET_DVR_TIME var4, String var5);

    NativeLong NET_DVR_GetFileByTime_V40(NativeLong var1, String var2, NET_DVR_PLAYCOND var3);

    boolean NET_DVR_StopGetFile(NativeLong var1);

    int NET_DVR_GetDownloadPos(NativeLong var1);

    int NET_DVR_GetPlayBackPos(NativeLong var1);

    NativeLong NET_DVR_Upgrade(NativeLong var1, String var2);

    int NET_DVR_GetUpgradeState(NativeLong var1);

    int NET_DVR_GetUpgradeProgress(NativeLong var1);

    boolean NET_DVR_CloseUpgradeHandle(NativeLong var1);

    boolean NET_DVR_SetNetworkEnvironment(int var1);

    NativeLong NET_DVR_FormatDisk(NativeLong var1, NativeLong var2);

    boolean NET_DVR_GetFormatProgress(NativeLong var1, NativeLongByReference var2, NativeLongByReference var3, NativeLongByReference var4);

    boolean NET_DVR_CloseFormatHandle(NativeLong var1);

    NativeLong NET_DVR_SetupAlarmChan(NativeLong var1);

    boolean NET_DVR_CloseAlarmChan(NativeLong var1);

    NativeLong NET_DVR_SetupAlarmChan_V30(NativeLong var1);

    boolean NET_DVR_CloseAlarmChan_V30(NativeLong var1);

    NativeLong NET_DVR_StartVoiceCom(NativeLong var1, FVoiceDataCallBack var2, int var3);

    NativeLong NET_DVR_StartVoiceCom_V30(NativeLong var1, int var2, boolean var3, FVoiceDataCallBack_V30 var4, Pointer var5);

    boolean NET_DVR_SetVoiceComClientVolume(NativeLong var1, short var2);

    boolean NET_DVR_StopVoiceCom(NativeLong var1);

    NativeLong NET_DVR_StartVoiceCom_MR(NativeLong var1, FVoiceDataCallBack_MR var2, int var3);

    NativeLong NET_DVR_StartVoiceCom_MR_V30(NativeLong var1, int var2, FVoiceDataCallBack_MR_V30 var3, Pointer var4);

    boolean NET_DVR_VoiceComSendData(NativeLong var1, String var2, int var3);

    boolean NET_DVR_ClientAudioStart();

    boolean NET_DVR_ClientAudioStart_V30(FVoiceDataCallBack2 var1, Pointer var2);

    boolean NET_DVR_ClientAudioStop();

    boolean NET_DVR_AddDVR(NativeLong var1);

    NativeLong NET_DVR_AddDVR_V30(NativeLong var1, int var2);

    boolean NET_DVR_DelDVR(NativeLong var1);

    boolean NET_DVR_DelDVR_V30(NativeLong var1);

    NativeLong NET_DVR_SerialStart(NativeLong var1, NativeLong var2, FSerialDataCallBack var3, int var4);

    NativeLong NET_DVR_SerialStart_V40(NativeLong var1, Pointer var2, NativeLong var3, FSerialDataCallBack_V40 var4, Pointer var5);

    boolean NET_DVR_SerialSend(NativeLong var1, NativeLong var2, String var3, int var4);

    boolean NET_DVR_SerialStop(NativeLong var1);

    boolean NET_DVR_SendTo232Port(NativeLong var1, String var2, int var3);

    boolean NET_DVR_SendToSerialPort(NativeLong var1, int var2, int var3, String var4, int var5);

    Pointer NET_DVR_InitG722Decoder(int var1);

    void NET_DVR_ReleaseG722Decoder(Pointer var1);

    boolean NET_DVR_DecodeG722Frame(Pointer var1, String var2, String var3);

    Pointer NET_DVR_InitG722Encoder();

    boolean NET_DVR_EncodeG722Frame(Pointer var1, String var2, String var3);

    void NET_DVR_ReleaseG722Encoder(Pointer var1);

    boolean NET_DVR_ClickKey(NativeLong var1, NativeLong var2);

    boolean NET_DVR_StartDVRRecord(NativeLong var1, NativeLong var2, NativeLong var3);

    boolean NET_DVR_StopDVRRecord(NativeLong var1, NativeLong var2);

    boolean NET_DVR_InitDevice_Card(NativeLongByReference var1);

    boolean NET_DVR_ReleaseDevice_Card();

    boolean NET_DVR_InitDDraw_Card(int var1, int var2);

    boolean NET_DVR_ReleaseDDraw_Card();

    NativeLong NET_DVR_RealPlay_Card(NativeLong var1, NET_DVR_CARDINFO var2, NativeLong var3);

    boolean NET_DVR_ResetPara_Card(NativeLong var1, NET_DVR_DISPLAY_PARA var2);

    boolean NET_DVR_RefreshSurface_Card();

    boolean NET_DVR_ClearSurface_Card();

    boolean NET_DVR_RestoreSurface_Card();

    boolean NET_DVR_OpenSound_Card(NativeLong var1);

    boolean NET_DVR_CloseSound_Card(NativeLong var1);

    boolean NET_DVR_SetVolume_Card(NativeLong var1, short var2);

    boolean NET_DVR_AudioPreview_Card(NativeLong var1, boolean var2);

    NativeLong NET_DVR_GetCardLastError_Card();

    Pointer NET_DVR_GetChanHandle_Card(NativeLong var1);

    boolean NET_DVR_CapturePicture_Card(NativeLong var1, String var2);

    boolean NET_DVR_GetSerialNum_Card(NativeLong var1, IntByReference var2);

    NativeLong NET_DVR_FindDVRLog(NativeLong var1, NativeLong var2, int var3, int var4, NET_DVR_TIME var5, NET_DVR_TIME var6);

    NativeLong NET_DVR_FindNextLog(NativeLong var1, NET_DVR_LOG var2);

    boolean NET_DVR_FindLogClose(NativeLong var1);

    NativeLong NET_DVR_FindDVRLog_V30(NativeLong var1, NativeLong var2, int var3, int var4, NET_DVR_TIME var5, NET_DVR_TIME var6, boolean var7);

    NativeLong NET_DVR_FindNextLog_V30(NativeLong var1, NET_DVR_LOG_V30 var2);

    boolean NET_DVR_FindLogClose_V30(NativeLong var1);

    NativeLong NET_DVR_FindFileByCard(NativeLong var1, NativeLong var2, int var3, int var4, String var5, NET_DVR_TIME var6, NET_DVR_TIME var7);

    boolean NET_DVR_CaptureJPEGPicture(NativeLong var1, NativeLong var2, NET_DVR_JPEGPARA var3, String var4);

    boolean NET_DVR_CaptureJPEGPicture_NEW(NativeLong var1, NativeLong var2, NET_DVR_JPEGPARA var3, String var4, int var5, IntByReference var6);

    int NET_DVR_GetRealPlayerIndex(NativeLong var1);

    int NET_DVR_GetPlayBackPlayerIndex(NativeLong var1);

    boolean NET_DVR_SetScaleCFG(NativeLong var1, int var2);

    boolean NET_DVR_GetScaleCFG(NativeLong var1, IntByReference var2);

    boolean NET_DVR_SetScaleCFG_V30(NativeLong var1, NET_DVR_SCALECFG var2);

    boolean NET_DVR_GetScaleCFG_V30(NativeLong var1, NET_DVR_SCALECFG var2);

    boolean NET_DVR_SetATMPortCFG(NativeLong var1, short var2);

    boolean NET_DVR_GetATMPortCFG(NativeLong var1, ShortByReference var2);

    boolean NET_DVR_InitDDrawDevice();

    boolean NET_DVR_ReleaseDDrawDevice();

    NativeLong NET_DVR_GetDDrawDeviceTotalNums();

    boolean NET_DVR_SetDDrawDevice(NativeLong var1, int var2);

    boolean NET_DVR_PTZSelZoomIn(NativeLong var1, NET_DVR_POINT_FRAME var2);

    boolean NET_DVR_PTZSelZoomIn_EX(NativeLong var1, NativeLong var2, NET_DVR_POINT_FRAME var3);

    boolean NET_DVR_StartDecode(NativeLong var1, NativeLong var2, NET_DVR_DECODERINFO var3);

    boolean NET_DVR_StopDecode(NativeLong var1, NativeLong var2);

    boolean NET_DVR_GetDecoderState(NativeLong var1, NativeLong var2, NET_DVR_DECODERSTATE var3);

    boolean NET_DVR_SetDecInfo(NativeLong var1, NativeLong var2, NET_DVR_DECCFG var3);

    boolean NET_DVR_GetDecInfo(NativeLong var1, NativeLong var2, NET_DVR_DECCFG var3);

    boolean NET_DVR_SetDecTransPort(NativeLong var1, NET_DVR_PORTCFG var2);

    boolean NET_DVR_GetDecTransPort(NativeLong var1, NET_DVR_PORTCFG var2);

    boolean NET_DVR_DecPlayBackCtrl(NativeLong var1, NativeLong var2, int var3, int var4, IntByReference var5, NET_DVR_PLAYREMOTEFILE var6);

    boolean NET_DVR_StartDecSpecialCon(NativeLong var1, NativeLong var2, NET_DVR_DECCHANINFO var3);

    boolean NET_DVR_StopDecSpecialCon(NativeLong var1, NativeLong var2, NET_DVR_DECCHANINFO var3);

    boolean NET_DVR_DecCtrlDec(NativeLong var1, NativeLong var2, int var3);

    boolean NET_DVR_DecCtrlScreen(NativeLong var1, NativeLong var2, int var3);

    boolean NET_DVR_GetDecCurLinkStatus(NativeLong var1, NativeLong var2, NET_DVR_DECSTATUS var3);

    boolean NET_DVR_MatrixStartDynamic(NativeLong var1, int var2, NET_DVR_MATRIX_DYNAMIC_DEC var3);

    boolean NET_DVR_MatrixStopDynamic(NativeLong var1, int var2);

    boolean NET_DVR_MatrixGetDecChanInfo(NativeLong var1, int var2, NET_DVR_MATRIX_DEC_CHAN_INFO var3);

    boolean NET_DVR_MatrixSetLoopDecChanInfo(NativeLong var1, int var2, NET_DVR_MATRIX_LOOP_DECINFO var3);

    boolean NET_DVR_MatrixGetLoopDecChanInfo(NativeLong var1, int var2, NET_DVR_MATRIX_LOOP_DECINFO var3);

    boolean NET_DVR_MatrixSetLoopDecChanEnable(NativeLong var1, int var2, int var3);

    boolean NET_DVR_MatrixGetLoopDecChanEnable(NativeLong var1, int var2, IntByReference var3);

    boolean NET_DVR_MatrixGetLoopDecEnable(NativeLong var1, IntByReference var2);

    boolean NET_DVR_MatrixSetDecChanEnable(NativeLong var1, int var2, int var3);

    boolean NET_DVR_MatrixGetDecChanEnable(NativeLong var1, int var2, IntByReference var3);

    boolean NET_DVR_MatrixGetDecChanStatus(NativeLong var1, int var2, NET_DVR_MATRIX_DEC_CHAN_STATUS var3);

    boolean NET_DVR_MatrixSetTranInfo(NativeLong var1, NET_DVR_MATRIX_TRAN_CHAN_CONFIG var2);

    boolean NET_DVR_MatrixGetTranInfo(NativeLong var1, NET_DVR_MATRIX_TRAN_CHAN_CONFIG var2);

    boolean NET_DVR_MatrixSetRemotePlay(NativeLong var1, int var2, NET_DVR_MATRIX_DEC_REMOTE_PLAY var3);

    boolean NET_DVR_MatrixSetRemotePlayControl(NativeLong var1, int var2, int var3, int var4, IntByReference var5);

    boolean NET_DVR_MatrixGetRemotePlayStatus(NativeLong var1, int var2, NET_DVR_MATRIX_DEC_REMOTE_PLAY_STATUS var3);

    boolean NET_DVR_RefreshPlay(NativeLong var1);

    boolean NET_DVR_RestoreConfig(NativeLong var1);

    boolean NET_DVR_SaveConfig(NativeLong var1);

    boolean NET_DVR_RebootDVR(NativeLong var1);

    boolean NET_DVR_ShutDownDVR(NativeLong var1);

    boolean NET_DVR_GetDVRConfig(NativeLong var1, int var2, NativeLong var3, Pointer var4, int var5, IntByReference var6);

    boolean NET_DVR_SetDVRConfig(NativeLong var1, int var2, NativeLong var3, Pointer var4, int var5);

    boolean NET_DVR_GetDeviceConfig(NativeLong var1, int var2, int var3, Pointer var4, int var5, Pointer var6, Pointer var7, int var8);

    boolean NET_DVR_SetDeviceConfig(NativeLong var1, int var2, int var3, Pointer var4, int var5, Pointer var6, Pointer var7, int var8);

    boolean NET_DVR_GetDVRWorkState_V30(NativeLong var1, NET_DVR_WORKSTATE_V30 var2);

    boolean NET_DVR_GetDVRWorkState(NativeLong var1, NET_DVR_WORKSTATE var2);

    boolean NET_DVR_SetVideoEffect(NativeLong var1, NativeLong var2, int var3, int var4, int var5, int var6);

    boolean NET_DVR_GetVideoEffect(NativeLong var1, NativeLong var2, IntByReference var3, IntByReference var4, IntByReference var5, IntByReference var6);

    boolean NET_DVR_ClientGetframeformat(NativeLong var1, NET_DVR_FRAMEFORMAT var2);

    boolean NET_DVR_ClientSetframeformat(NativeLong var1, NET_DVR_FRAMEFORMAT var2);

    boolean NET_DVR_ClientGetframeformat_V30(NativeLong var1, NET_DVR_FRAMEFORMAT_V30 var2);

    boolean NET_DVR_ClientSetframeformat_V30(NativeLong var1, NET_DVR_FRAMEFORMAT_V30 var2);

    boolean NET_DVR_GetAlarmOut_V30(NativeLong var1, NET_DVR_ALARMOUTSTATUS_V30 var2);

    boolean NET_DVR_GetAlarmOut(NativeLong var1, NET_DVR_ALARMOUTSTATUS var2);

    boolean NET_DVR_SetAlarmOut(NativeLong var1, NativeLong var2, NativeLong var3);

    boolean NET_DVR_ClientSetVideoEffect(NativeLong var1, int var2, int var3, int var4, int var5);

    boolean NET_DVR_ClientGetVideoEffect(NativeLong var1, IntByReference var2, IntByReference var3, IntByReference var4, IntByReference var5);

    boolean NET_DVR_GetConfigFile(NativeLong var1, String var2);

    boolean NET_DVR_SetConfigFile(NativeLong var1, String var2);

    boolean NET_DVR_GetConfigFile_V30(NativeLong var1, Pointer var2, int var3, IntByReference var4);

    boolean NET_DVR_GetConfigFile_EX(NativeLong var1, Pointer var2, int var3);

    boolean NET_DVR_SetConfigFile_EX(NativeLong var1, String var2, int var3);

    boolean NET_DVR_SetLogToFile(int var1, String var2, boolean var3);

    boolean NET_DVR_GetSDKState(NET_DVR_SDKSTATE var1);

    boolean NET_DVR_GetSDKAbility(NET_DVR_SDKABL var1);

    boolean NET_DVR_GetPTZProtocol(NativeLong var1, NET_DVR_PTZCFG var2);

    boolean NET_DVR_LockPanel(NativeLong var1);

    boolean NET_DVR_UnLockPanel(NativeLong var1);

    boolean NET_DVR_SetRtspConfig(NativeLong var1, int var2, NET_DVR_RTSPCFG var3, int var4);

    boolean NET_DVR_GetRtspConfig(NativeLong var1, int var2, NET_DVR_RTSPCFG var3, int var4);

    NativeLong NET_DVR_AdapterUpgrade(NativeLong var1, String var2);

    NativeLong NET_DVR_VcalibUpgrade(NativeLong var1, NativeLong var2, String var3);

    NativeLong NET_DVR_Upgrade_V40(NativeLong var1, ENUM_UPGRADE_TYPE var2, String var3, Pointer var4, int var5);

    boolean NET_DVR_GetLocalIP(byte[] var1, IntByReference var2, ByteByReference var3);

    boolean NET_DVR_SetValidIP(int var1, boolean var2);

    boolean NET_DVR_STDXMLConfig(NativeLong var1, NET_DVR_XML_CONFIG_INPUT var2, NET_DVR_XML_CONFIG_OUTPUT var3);

    NativeLong NET_DVR_Upgrade_V50(NativeLong var1, NET_DVR_UPGRADE_PARAM var2);

    boolean NET_DVR_SetRecvTimeOut(int var1);

    public static class NET_DVR_TIME extends Structure {
        public int dwYear;
        public int dwMonth;
        public int dwDay;
        public int dwHour;
        public int dwMinute;
        public int dwSecond;

        public String toString() {
            return "NET_DVR_TIME.dwYear: " + this.dwYear + "\nNET_DVR_TIME.dwMonth: \n" + this.dwMonth + "\nNET_DVR_TIME.dwDay: \n" + this.dwDay + "\nNET_DVR_TIME.dwHour: \n" + this.dwHour + "\nNET_DVR_TIME.dwMinute: \n" + this.dwMinute + "\nNET_DVR_TIME.dwSecond: \n" + this.dwSecond;
        }

        public String toStringTime() {
            return String.format("%02d/%02d/%02d%02d:%02d:%02d", this.dwYear, this.dwMonth, this.dwDay, this.dwHour, this.dwMinute, this.dwSecond);
        }

        public String toStringTitle() {
            return String.format("Time%02d%02d%02d%02d%02d%02d", this.dwYear, this.dwMonth, this.dwDay, this.dwHour, this.dwMinute, this.dwSecond);
        }
    }

    public static class NET_DVR_SCHEDTIME extends Structure {
        public byte byStartHour;
        public byte byStartMin;
        public byte byStopHour;
        public byte byStopMin;
    }

    public static class NET_DVR_HANDLEEXCEPTION_V30 extends Structure {
        public int dwHandleType;
        public byte[] byRelAlarmOut = new byte[96];
    }

    public static class NET_DVR_HANDLEEXCEPTION extends Structure {
        public int dwHandleType;
        public byte[] byRelAlarmOut = new byte[4];
    }

    public static class NET_DVR_DEVICECFG extends Structure {
        public int dwSize;
        public byte[] sDVRName = new byte[32];
        public int dwDVRID;
        public int dwRecycleRecord;
        public byte[] sSerialNumber = new byte[48];
        public int dwSoftwareVersion;
        public int dwSoftwareBuildDate;
        public int dwDSPSoftwareVersion;
        public int dwDSPSoftwareBuildDate;
        public int dwPanelVersion;
        public int dwHardwareVersion;
        public byte byAlarmInPortNum;
        public byte byAlarmOutPortNum;
        public byte byRS232Num;
        public byte byRS485Num;
        public byte byNetworkPortNum;
        public byte byDiskCtrlNum;
        public byte byDiskNum;
        public byte byDVRType;
        public byte byChanNum;
        public byte byStartChan;
        public byte byDecordChans;
        public byte byVGANum;
        public byte byUSBNum;
        public byte byAuxoutNum;
        public byte byAudioNum;
        public byte byIPChanNum;
    }

    public static class NET_DVR_IPADDR extends Structure {
        public byte[] sIpV4 = new byte[16];
        public byte[] byRes = new byte[128];

        public String toString() {
            return "NET_DVR_IPADDR.sIpV4: " + new String(this.sIpV4) + "\nNET_DVR_IPADDR.byRes: " + new String(this.byRes) + "\n";
        }
    }

    public static class NET_DVR_ETHERNET_V30 extends Structure {
        public NET_DVR_IPADDR struDVRIP = new NET_DVR_IPADDR();
        public NET_DVR_IPADDR struDVRIPMask = new NET_DVR_IPADDR();
        public int dwNetInterface;
        public short wDVRPort;
        public short wMTU;
        public byte[] byMACAddr = new byte[6];

        public String toString() {
            return "NET_DVR_ETHERNET_V30.struDVRIP: \n" + this.struDVRIP + "\nNET_DVR_ETHERNET_V30.struDVRIPMask: \n" + this.struDVRIPMask + "\nNET_DVR_ETHERNET_V30.dwNetInterface: " + this.dwNetInterface + "\nNET_DVR_ETHERNET_V30.wDVRPort: " + this.wDVRPort + "\nNET_DVR_ETHERNET_V30.wMTU: " + this.wMTU + "\nNET_DVR_ETHERNET_V30.byMACAddr: " + new String(this.byMACAddr) + "\n";
        }
    }

    public static class NET_DVR_ETHERNET extends Structure {
        public byte[] sDVRIP = new byte[16];
        public byte[] sDVRIPMask = new byte[16];
        public int dwNetInterface;
        public short wDVRPort;
        public byte[] byMACAddr = new byte[6];
    }

    public static class NET_DVR_PPPOECFG extends Structure {
        public int dwPPPoE;
        public byte[] sPPPoEUser = new byte[32];
        public byte[] sPPPoEPassword = new byte[16];
        public NET_DVR_IPADDR struPPPoEIP = new NET_DVR_IPADDR();
    }

    public static class NET_DVR_NETCFG_V30 extends Structure {
        public int dwSize;
        public NET_DVR_ETHERNET_V30[] struEtherNet = new NET_DVR_ETHERNET_V30[2];
        public NET_DVR_IPADDR[] struRes1 = new NET_DVR_IPADDR[2];
        public NET_DVR_IPADDR struAlarmHostIpAddr;
        public short[] wRes2 = new short[2];
        public short wAlarmHostIpPort;
        public byte byUseDhcp;
        public byte byRes3;
        public NET_DVR_IPADDR struDnsServer1IpAddr = new NET_DVR_IPADDR();
        public NET_DVR_IPADDR struDnsServer2IpAddr = new NET_DVR_IPADDR();
        public byte[] byIpResolver = new byte[64];
        public short wIpResolverPort;
        public short wHttpPortNo;
        public NET_DVR_IPADDR struMulticastIpAddr = new NET_DVR_IPADDR();
        public NET_DVR_IPADDR struGatewayIpAddr = new NET_DVR_IPADDR();
        public NET_DVR_PPPOECFG struPPPoE = new NET_DVR_PPPOECFG();
        public byte[] byRes = new byte[64];

        public String toString() {
            return "NET_DVR_NETCFG_V30.dwSize: " + this.dwSize + "\nNET_DVR_NETCFG_V30.struEtherNet[0]: \n" + this.struEtherNet[0] + "\nNET_DVR_NETCFG_V30.struAlarmHostIpAddr: \n" + this.struAlarmHostIpAddr + "\nNET_DVR_NETCFG_V30.wAlarmHostIpPort: " + this.wAlarmHostIpPort + "\nNET_DVR_NETCFG_V30.wHttpPortNo: " + this.wHttpPortNo + "\nNET_DVR_NETCFG_V30.struGatewayIpAddr: \n" + this.struGatewayIpAddr + "\n";
        }

        public NET_DVR_NETCFG_V30() {
            for(int i = 0; i < 2; ++i) {
                this.struEtherNet[i] = new NET_DVR_ETHERNET_V30();
                this.struRes1[i] = new NET_DVR_IPADDR();
            }

        }
    }

    public static class NET_DVR_NETCFG extends Structure {
        public int dwSize;
        public NET_DVR_ETHERNET[] struEtherNet = new NET_DVR_ETHERNET[2];
        public byte[] sManageHostIP = new byte[16];
        public short wManageHostPort;
        public byte[] sIPServerIP = new byte[16];
        public byte[] sMultiCastIP = new byte[16];
        public byte[] sGatewayIP = new byte[16];
        public byte[] sNFSIP = new byte[16];
        public byte[] sNFSDirectory = new byte[128];
        public int dwPPPOE;
        public byte[] sPPPoEUser = new byte[32];
        public byte[] sPPPoEPassword = new byte[16];
        public byte[] sPPPoEIP = new byte[16];

        public NET_DVR_NETCFG() {
            for(int i = 0; i < 2; ++i) {
                this.struEtherNet[i] = new NET_DVR_ETHERNET();
            }

        }
    }

    public static class NET_DVR_SCHEDTIMEWEEK extends Structure {
        public NET_DVR_SCHEDTIME[] struAlarmTime = new NET_DVR_SCHEDTIME[8];

        public NET_DVR_SCHEDTIMEWEEK() {
            for(int i = 0; i < 8; ++i) {
                this.struAlarmTime[i] = new NET_DVR_SCHEDTIME();
            }

        }
    }

    public static class byte96 extends Structure {
        public byte[] byMotionScope = new byte[96];
    }

    public static class NET_DVR_MOTION_V30 extends Structure {
        public byte96[] byMotionScope = new byte96[64];
        public byte byMotionSensitive;
        public byte byEnableHandleMotion;
        public byte byPrecision;
        public byte reservedData;
        public NET_DVR_HANDLEEXCEPTION_V30 struMotionHandleType = new NET_DVR_HANDLEEXCEPTION_V30();
        public NET_DVR_SCHEDTIMEWEEK[] struAlarmTime = new NET_DVR_SCHEDTIMEWEEK[7];
        public byte[] byRelRecordChan = new byte[64];

        public NET_DVR_MOTION_V30() {
            for(int i = 0; i < 64; ++i) {
                this.byMotionScope[i] = new byte96();
            }

            for(int i = 0; i < 7; ++i) {
                this.struAlarmTime[i] = new NET_DVR_SCHEDTIMEWEEK();
            }

        }
    }

    public static class NET_DVR_MOTION extends Structure {
        public byte[][] byMotionScope = new byte[18][22];
        public byte byMotionSensitive;
        public byte byEnableHandleMotion;
        public byte[] reservedData = new byte[2];
        public NET_DVR_HANDLEEXCEPTION strMotionHandleType = new NET_DVR_HANDLEEXCEPTION();
        public byte[] byRelRecordChan = new byte[16];
    }

    public static class NET_DVR_HIDEALARM_V30 extends Structure {
        public int dwEnableHideAlarm;
        public short wHideAlarmAreaTopLeftX;
        public short wHideAlarmAreaTopLeftY;
        public short wHideAlarmAreaWidth;
        public short wHideAlarmAreaHeight;
        public NET_DVR_HANDLEEXCEPTION_V30 strHideAlarmHandleType = new NET_DVR_HANDLEEXCEPTION_V30();
        public NET_DVR_SCHEDTIMEWEEK[] struAlarmTime = new NET_DVR_SCHEDTIMEWEEK[7];

        public NET_DVR_HIDEALARM_V30() {
            for(int i = 0; i < 7; ++i) {
                this.struAlarmTime[i] = new NET_DVR_SCHEDTIMEWEEK();
            }

        }
    }

    public static class NET_DVR_HIDEALARM extends Structure {
        public int dwEnableHideAlarm;
        public short wHideAlarmAreaTopLeftX;
        public short wHideAlarmAreaTopLeftY;
        public short wHideAlarmAreaWidth;
        public short wHideAlarmAreaHeight;
        public NET_DVR_HANDLEEXCEPTION strHideAlarmHandleType = new NET_DVR_HANDLEEXCEPTION();
    }

    public static class NET_DVR_VILOST_V30 extends Structure {
        public byte byEnableHandleVILost;
        public NET_DVR_HANDLEEXCEPTION_V30 strVILostHandleType = new NET_DVR_HANDLEEXCEPTION_V30();
        public NET_DVR_SCHEDTIMEWEEK[] struAlarmTime = new NET_DVR_SCHEDTIMEWEEK[7];

        public NET_DVR_VILOST_V30() {
            for(int i = 0; i < 7; ++i) {
                this.struAlarmTime[i] = new NET_DVR_SCHEDTIMEWEEK();
            }

        }
    }

    public static class NET_DVR_VILOST extends Structure {
        public byte byEnableHandleVILost;
        public NET_DVR_HANDLEEXCEPTION strVILostHandleType = new NET_DVR_HANDLEEXCEPTION();
    }

    public static class NET_DVR_SHELTER extends Structure {
        public short wHideAreaTopLeftX;
        public short wHideAreaTopLeftY;
        public short wHideAreaWidth;
        public short wHideAreaHeight;
    }

    public static class NET_DVR_COLOR extends Structure {
        public byte byBrightness;
        public byte byContrast;
        public byte bySaturation;
        public byte byHue;
    }

    public static class NET_DVR_VICOLOR extends Structure {
        public NET_DVR_COLOR[] struColor = new NET_DVR_COLOR[8];
        public NET_DVR_SCHEDTIME[] struHandleTime = new NET_DVR_SCHEDTIME[8];

        public NET_DVR_VICOLOR() {
            for(int i = 0; i < 8; ++i) {
                this.struColor[i] = new NET_DVR_COLOR();
                this.struHandleTime[i] = new NET_DVR_SCHEDTIME();
            }

        }
    }

    public static class NET_DVR_PICCFG_V30 extends Structure {
        public int dwSize;
        public byte[] sChanName = new byte[32];
        public int dwVideoFormat;
        public NET_DVR_VICOLOR struViColor = new NET_DVR_VICOLOR();
        public int dwShowChanName;
        public short wShowNameTopLeftX;
        public short wShowNameTopLeftY;
        public NET_DVR_VILOST_V30 struVILost = new NET_DVR_VILOST_V30();
        public NET_DVR_VILOST_V30 struAULost = new NET_DVR_VILOST_V30();
        public NET_DVR_MOTION_V30 struMotion = new NET_DVR_MOTION_V30();
        public NET_DVR_HIDEALARM_V30 struHideAlarm = new NET_DVR_HIDEALARM_V30();
        public int dwEnableHide;
        public NET_DVR_SHELTER[] struShelter = new NET_DVR_SHELTER[4];
        public int dwShowOsd;
        public short wOSDTopLeftX;
        public short wOSDTopLeftY;
        public byte byOSDType;
        public byte byDispWeek;
        public byte byOSDAttrib;
        public byte byHourOSDType;
        public byte[] byRes = new byte[64];

        public NET_DVR_PICCFG_V30() {
            for(int i = 0; i < 4; ++i) {
                this.struShelter[i] = new NET_DVR_SHELTER();
            }

        }
    }

    public static class NET_DVR_PICCFG_EX extends Structure {
        public int dwSize;
        public byte[] sChanName = new byte[32];
        public int dwVideoFormat;
        public byte byBrightness;
        public byte byContrast;
        public byte bySaturation;
        public byte byHue;
        public int dwShowChanName;
        public short wShowNameTopLeftX;
        public short wShowNameTopLeftY;
        public NET_DVR_VILOST struVILost = new NET_DVR_VILOST();
        public NET_DVR_MOTION struMotion = new NET_DVR_MOTION();
        public NET_DVR_HIDEALARM struHideAlarm = new NET_DVR_HIDEALARM();
        public int dwEnableHide;
        public NET_DVR_SHELTER[] struShelter = new NET_DVR_SHELTER[4];
        public int dwShowOsd;
        public short wOSDTopLeftX;
        public short wOSDTopLeftY;
        public byte byOSDType;
        public byte byDispWeek;
        public byte byOSDAttrib;
        public byte byHourOsdType;

        public NET_DVR_PICCFG_EX() {
            for(int i = 0; i < 4; ++i) {
                this.struShelter[i] = new NET_DVR_SHELTER();
            }

        }
    }

    public static class NET_DVR_PICCFG extends Structure {
        public int dwSize;
        public byte[] sChanName = new byte[32];
        public int dwVideoFormat;
        public byte byBrightness;
        public byte byContrast;
        public byte bySaturation;
        public byte byHue;
        public int dwShowChanName;
        public short wShowNameTopLeftX;
        public short wShowNameTopLeftY;
        public NET_DVR_VILOST struVILost = new NET_DVR_VILOST();
        public NET_DVR_MOTION struMotion = new NET_DVR_MOTION();
        public NET_DVR_HIDEALARM struHideAlarm = new NET_DVR_HIDEALARM();
        public int dwEnableHide;
        public short wHideAreaTopLeftX;
        public short wHideAreaTopLeftY;
        public short wHideAreaWidth;
        public short wHideAreaHeight;
        public int dwShowOsd;
        public short wOSDTopLeftX;
        public short wOSDTopLeftY;
        public byte byOSDType;
        byte byDispWeek;
        byte byOSDAttrib;
        public byte reservedData2;
    }

    public static class NET_DVR_COMPRESSION_INFO_V30 extends Structure {
        public byte byStreamType;
        public byte byResolution;
        public byte byBitrateType;
        public byte byPicQuality;
        public int dwVideoBitrate;
        public int dwVideoFrameRate;
        public short wIntervalFrameI;
        public byte byIntervalBPFrame;
        public byte byres1;
        public byte byVideoEncType;
        public byte byAudioEncType;
        public byte byVideoEncComplexity;
        public byte byEnableSvc;
        public byte byFormatType;
        public byte byAudioBitRate;
        public byte bySteamSmooth;
        public byte byAudioSamplingRate;
        public byte bySmartCodec;
        public byte byres;
        public short wAverageVideoBitrate;
    }

    public static class NET_DVR_COMPRESSIONCFG_V30 extends Structure {
        public int dwSize;
        public NET_DVR_COMPRESSION_INFO_V30 struNormHighRecordPara = new NET_DVR_COMPRESSION_INFO_V30();
        public NET_DVR_COMPRESSION_INFO_V30 struRes = new NET_DVR_COMPRESSION_INFO_V30();
        public NET_DVR_COMPRESSION_INFO_V30 struEventRecordPara = new NET_DVR_COMPRESSION_INFO_V30();
        public NET_DVR_COMPRESSION_INFO_V30 struNetPara = new NET_DVR_COMPRESSION_INFO_V30();
    }

    public static class NET_DVR_COMPRESSION_INFO extends Structure {
        public byte byStreamType;
        public byte byResolution;
        public byte byBitrateType;
        public byte byPicQuality;
        public int dwVideoBitrate;
        public int dwVideoFrameRate;
    }

    public static class NET_DVR_COMPRESSIONCFG extends Structure {
        public int dwSize;
        public NET_DVR_COMPRESSION_INFO struRecordPara = new NET_DVR_COMPRESSION_INFO();
        public NET_DVR_COMPRESSION_INFO struNetPara = new NET_DVR_COMPRESSION_INFO();
    }

    public static class NET_DVR_COMPRESSION_INFO_EX extends Structure {
        public byte byStreamType;
        public byte byResolution;
        public byte byBitrateType;
        public byte byPicQuality;
        public int dwVideoBitrate;
        public int dwVideoFrameRate;
        public short wIntervalFrameI;
        public byte byIntervalBPFrame;
        public byte byENumber;
    }

    public static class NET_DVR_COMPRESSIONCFG_EX extends Structure {
        public int dwSize;
        public NET_DVR_COMPRESSION_INFO_EX struRecordPara = new NET_DVR_COMPRESSION_INFO_EX();
        public NET_DVR_COMPRESSION_INFO_EX struNetPara = new NET_DVR_COMPRESSION_INFO_EX();
    }

    public static class NET_DVR_RECCOMPRESSIONCFG_EX extends Structure {
        int dwSize;
        NET_DVR_COMPRESSION_INFO_EX[][] struRecTimePara = new NET_DVR_COMPRESSION_INFO_EX[7][4];

        public NET_DVR_RECCOMPRESSIONCFG_EX() {
            for(int i = 0; i < 7; ++i) {
                for(int j = 0; j < 4; ++j) {
                    this.struRecTimePara[i][j] = new NET_DVR_COMPRESSION_INFO_EX();
                }
            }

        }
    }

    public static class NET_DVR_RECORDSCHED extends Structure {
        public NET_DVR_SCHEDTIME struRecordTime = new NET_DVR_SCHEDTIME();
        public byte byRecordType;
        public byte[] reservedData = new byte[3];
    }

    public static class NET_DVR_RECORDDAY extends Structure {
        public short wAllDayRecord;
        public byte byRecordType;
        public byte reservedData;
    }

    public static class NET_DVR_RECORDSCHEDWEEK extends Structure {
        public NET_DVR_RECORDSCHED[] struRecordSched = (NET_DVR_RECORDSCHED[])(new NET_DVR_RECORDSCHED()).toArray(8);
    }

    public static class NET_DVR_RECORD_V30 extends Structure {
        public int dwSize;
        public int dwRecord;
        public NET_DVR_RECORDDAY[] struRecAllDay = (NET_DVR_RECORDDAY[])(new NET_DVR_RECORDDAY()).toArray(7);
        public NET_DVR_RECORDSCHEDWEEK[] struRecordSched = (NET_DVR_RECORDSCHEDWEEK[])(new NET_DVR_RECORDSCHEDWEEK()).toArray(7);
        public int dwRecordTime;
        public int dwPreRecordTime;
        public int dwRecorderDuration;
        public byte byRedundancyRec;
        public byte byAudioRec;
        public byte[] byReserve = new byte[10];
    }

    public static class NET_DVR_RECORD extends Structure {
        public int dwSize;
        public int dwRecord;
        public NET_DVR_RECORDDAY[] struRecAllDay = (NET_DVR_RECORDDAY[])(new NET_DVR_RECORDDAY()).toArray(7);
        public NET_DVR_RECORDSCHEDWEEK[] struRecordSched = (NET_DVR_RECORDSCHEDWEEK[])(new NET_DVR_RECORDSCHEDWEEK()).toArray(7);
        public int dwRecordTime;
        public int dwPreRecordTime;
    }

    public static class NET_DVR_PTZ_PROTOCOL extends Structure {
        public int dwType;
        public byte[] byDescribe = new byte[16];
    }

    public static class NET_DVR_PTZCFG extends Structure {
        public int dwSize;
        public NET_DVR_PTZ_PROTOCOL[] struPtz = (NET_DVR_PTZ_PROTOCOL[])(new NET_DVR_PTZ_PROTOCOL()).toArray(200);
        public int dwPtzNum;
        public byte[] byRes = new byte[8];
    }

    public static class NET_DVR_DECODERCFG_V30 extends Structure {
        public int dwSize;
        public int dwBaudRate;
        public byte byDataBit;
        public byte byStopBit;
        public byte byParity;
        public byte byFlowcontrol;
        public short wDecoderType;
        public short wDecoderAddress;
        public byte[] bySetPreset = new byte[256];
        public byte[] bySetCruise = new byte[256];
        public byte[] bySetTrack = new byte[256];
    }

    public static class NET_DVR_DECODERCFG extends Structure {
        public int dwSize;
        public int dwBaudRate;
        public byte byDataBit;
        public byte byStopBit;
        public byte byParity;
        public byte byFlowcontrol;
        public short wDecoderType;
        public short wDecoderAddress;
        public byte[] bySetPreset = new byte[128];
        public byte[] bySetCruise = new byte[128];
        public byte[] bySetTrack = new byte[128];
    }

    public static class NET_DVR_PPPCFG_V30 extends Structure {
        public NET_DVR_IPADDR struRemoteIP = new NET_DVR_IPADDR();
        public NET_DVR_IPADDR struLocalIP = new NET_DVR_IPADDR();
        public byte[] sLocalIPMask = new byte[16];
        public byte[] sUsername = new byte[32];
        public byte[] sPassword = new byte[16];
        public byte byPPPMode;
        public byte byRedial;
        public byte byRedialMode;
        public byte byDataEncrypt;
        public int dwMTU;
        public byte[] sTelephoneNumber = new byte[32];
    }

    public static class NET_DVR_PPPCFG extends Structure {
        public byte[] sRemoteIP = new byte[16];
        public byte[] sLocalIP = new byte[16];
        public byte[] sLocalIPMask = new byte[16];
        public byte[] sUsername = new byte[32];
        public byte[] sPassword = new byte[16];
        public byte byPPPMode;
        public byte byRedial;
        public byte byRedialMode;
        public byte byDataEncrypt;
        public int dwMTU;
        public byte[] sTelephoneNumber = new byte[32];
    }

    public static class NET_DVR_SINGLE_RS232 extends Structure {
        public int dwBaudRate;
        public byte byDataBit;
        public byte byStopBit;
        public byte byParity;
        public byte byFlowcontrol;
        public int dwWorkMode;
    }

    public static class NET_DVR_RS232CFG_V30 extends Structure {
        public int dwSize;
        public NET_DVR_SINGLE_RS232 struRs232 = new NET_DVR_SINGLE_RS232();
        public byte[] byRes = new byte[84];
        public NET_DVR_PPPCFG_V30 struPPPConfig = new NET_DVR_PPPCFG_V30();
    }

    public static class NET_DVR_RS232CFG extends Structure {
        public int dwSize;
        public int dwBaudRate;
        public byte byDataBit;
        public byte byStopBit;
        public byte byParity;
        public byte byFlowcontrol;
        public int dwWorkMode;
        public NET_DVR_PPPCFG struPPPConfig = new NET_DVR_PPPCFG();
    }

    public static class NET_DVR_ALARMINCFG_V30 extends Structure {
        public int dwSize;
        public byte[] sAlarmInName = new byte[32];
        public byte byAlarmType;
        public byte byAlarmInHandle;
        public byte[] reservedData = new byte[2];
        public NET_DVR_HANDLEEXCEPTION_V30 struAlarmHandleType = new NET_DVR_HANDLEEXCEPTION_V30();
        public NET_DVR_SCHEDTIMEWEEK[] struAlarmTime = (NET_DVR_SCHEDTIMEWEEK[])(new NET_DVR_SCHEDTIMEWEEK()).toArray(7);
        public byte[] byRelRecordChan = new byte[64];
        public byte[] byEnablePreset = new byte[64];
        public byte[] byPresetNo = new byte[64];
        public byte[] byEnablePresetRevert = new byte[64];
        public short[] wPresetRevertDelay = new short[64];
        public byte[] byEnableCruise = new byte[64];
        public byte[] byCruiseNo = new byte[64];
        public byte[] byEnablePtzTrack = new byte[64];
        public byte[] byPTZTrack = new byte[64];
        public byte[] byRes = new byte[16];
    }

    public static class NET_DVR_ALARMINCFG extends Structure {
        public int dwSize;
        public byte[] sAlarmInName = new byte[32];
        public byte byAlarmType;
        public byte byAlarmInHandle;
        public NET_DVR_HANDLEEXCEPTION struAlarmHandleType = new NET_DVR_HANDLEEXCEPTION();
        public NET_DVR_SCHEDTIMEWEEK[] struAlarmTime = (NET_DVR_SCHEDTIMEWEEK[])(new NET_DVR_SCHEDTIMEWEEK()).toArray(7);
        public byte[] byRelRecordChan = new byte[16];
        public byte[] byEnablePreset = new byte[16];
        public byte[] byPresetNo = new byte[16];
        public byte[] byEnableCruise = new byte[16];
        public byte[] byCruiseNo = new byte[16];
        public byte[] byEnablePtzTrack = new byte[16];
        public byte[] byPTZTrack = new byte[16];
    }

    public static class NET_DVR_ADDIT_POSITION extends Structure {
        public byte[] sDevName = new byte[32];
        public int dwSpeed;
        public int dwLongitude;
        public int dwLatitude;
        public byte[] direction = new byte[2];
        public byte[] res = new byte[2];
    }

    public static class struIOAlarm extends Structure {
        public int dwAlarmInputNo;
        public int dwTrigerAlarmOutNum;
        public int dwTrigerRecordChanNum;
    }

    public static class NET_DVR_TIME_EX extends Structure {
        public short wYear;
        public byte byMonth;
        public byte byDay;
        public byte byHour;
        public byte byMinute;
        public byte bySecond;
        public byte byRes;
    }

    public static class struRecordingHost extends Structure {
        public byte bySubAlarmType;
        public byte[] byRes1 = new byte[3];
        public NET_DVR_TIME_EX struRecordEndTime = new NET_DVR_TIME_EX();
        public byte[] byRes = new byte[116];
    }

    public static class struAlarmHardDisk extends Structure {
        public int dwAlarmHardDiskNum;
    }

    public static class struAlarmChannel extends Structure {
        public int dwAlarmChanNum;
    }

    public static class uStruAlarm extends Union {
        public byte[] byUnionLen = new byte[128];
        public struIOAlarm struioAlarm = new struIOAlarm();
        public struAlarmHardDisk strualarmHardDisk = new struAlarmHardDisk();
        public struAlarmChannel sstrualarmChannel = new struAlarmChannel();
        public struRecordingHost strurecordingHost = new struRecordingHost();
    }

    public static class NET_DVR_ALRAM_FIXED_HEADER extends Structure {
        public int dwAlarmType;
        public NET_DVR_TIME_EX struAlarmTime = new NET_DVR_TIME_EX();
        public uStruAlarm ustruAlarm = new uStruAlarm();
    }

    public static class NET_DVR_ALARMINFO_V40 extends Structure {
        public NET_DVR_ALRAM_FIXED_HEADER struAlarmFixedHeader = new NET_DVR_ALRAM_FIXED_HEADER();
        public Pointer pAlarmData;
    }

    public static class NET_DVR_ALARMINFO_V30 extends Structure {
        public int dwAlarmType;
        public int dwAlarmInputNumber;
        public byte[] byAlarmOutputNumber = new byte[96];
        public byte[] byAlarmRelateChannel = new byte[64];
        public byte[] byChannel = new byte[64];
        public byte[] byDiskNumber = new byte[33];
    }

    public static class NET_DVR_ALARMINFO extends Structure {
        public int dwAlarmType;
        public int dwAlarmInputNumber;
        public int[] dwAlarmOutputNumber = new int[4];
        public int[] dwAlarmRelateChannel = new int[16];
        public int[] dwChannel = new int[16];
        public int[] dwDiskNumber = new int[16];
    }

    public static class NET_DVR_ALARMINFO_EX extends Structure {
        public int dwAlarmType;
        public int dwAlarmInputNumber;
        public int[] dwAlarmOutputNumber = new int[4];
        public int[] dwAlarmRelateChannel = new int[16];
        public int[] dwChannel = new int[16];
        public int[] dwDiskNumber = new int[16];
        public byte[] sSerialNumber = new byte[48];
        public byte[] sRemoteAlarmIP = new byte[16];
    }

    public static class NET_DVR_IPDEVINFO extends Structure {
        public int dwEnable;
        public byte[] sUserName = new byte[32];
        public byte[] sPassword = new byte[16];
        public NET_DVR_IPADDR struIP = new NET_DVR_IPADDR();
        public short wDVRPort;
        public byte[] byres = new byte[34];
    }

    public static class NET_DVR_IPCHANINFO extends Structure {
        public byte byEnable;
        public byte byIPID;
        public byte byChannel;
        public byte[] byres = new byte[33];
    }

    public static class NET_DVR_IPPARACFG extends Structure {
        public int dwSize;
        public NET_DVR_IPDEVINFO[] struIPDevInfo = (NET_DVR_IPDEVINFO[])(new NET_DVR_IPDEVINFO()).toArray(32);
        public byte[] byAnalogChanEnable = new byte[32];
        public NET_DVR_IPCHANINFO[] struIPChanInfo = (NET_DVR_IPCHANINFO[])(new NET_DVR_IPCHANINFO()).toArray(32);
    }

    public static class NET_DVR_IPALARMOUTINFO extends Structure {
        public byte byIPID;
        public byte byAlarmOut;
        public byte[] byRes = new byte[18];
    }

    public static class NET_DVR_IPALARMOUTCFG extends Structure {
        public int dwSize;
        public NET_DVR_IPALARMOUTINFO[] struIPAlarmOutInfo = (NET_DVR_IPALARMOUTINFO[])(new NET_DVR_IPALARMOUTINFO()).toArray(64);
    }

    public static class NET_DVR_IPALARMININFO extends Structure {
        public byte byIPID;
        public byte byAlarmIn;
        public byte[] byRes = new byte[18];
    }

    public static class NET_DVR_IPALARMINCFG extends Structure {
        public int dwSize;
        public NET_DVR_IPALARMININFO[] struIPAlarmInInfo = (NET_DVR_IPALARMININFO[])(new NET_DVR_IPALARMININFO()).toArray(128);
    }

    public static class NET_DVR_IPALARMINFO extends Structure {
        public NET_DVR_IPDEVINFO[] struIPDevInfo = (NET_DVR_IPDEVINFO[])(new NET_DVR_IPDEVINFO()).toArray(32);
        public byte[] byAnalogChanEnable = new byte[32];
        public NET_DVR_IPCHANINFO[] struIPChanInfo = (NET_DVR_IPCHANINFO[])(new NET_DVR_IPCHANINFO()).toArray(32);
        public NET_DVR_IPALARMININFO[] struIPAlarmInInfo = (NET_DVR_IPALARMININFO[])(new NET_DVR_IPALARMININFO()).toArray(128);
        public NET_DVR_IPALARMOUTINFO[] struIPAlarmOutInfo = (NET_DVR_IPALARMOUTINFO[])(new NET_DVR_IPALARMOUTINFO()).toArray(64);
    }

    public static class NET_DVR_SINGLE_HD extends Structure {
        public int dwHDNo;
        public int dwCapacity;
        public int dwFreeSpace;
        public int dwHdStatus;
        public byte byHDAttr;
        public byte[] byRes1 = new byte[3];
        public int dwHdGroup;
        public byte[] byRes2 = new byte[120];
    }

    public static class NET_DVR_HDCFG extends Structure {
        public int dwSize;
        public int dwHDCount;
        public NET_DVR_SINGLE_HD[] struHDInfo = (NET_DVR_SINGLE_HD[])(new NET_DVR_SINGLE_HD()).toArray(33);
    }

    public static class NET_DVR_SINGLE_HDGROUP extends Structure {
        public int dwHDGroupNo;
        public byte[] byHDGroupChans = new byte[64];
        public byte[] byRes = new byte[8];
    }

    public static class NET_DVR_HDGROUP_CFG extends Structure {
        public int dwSize;
        public int dwHDGroupCount;
        public NET_DVR_SINGLE_HDGROUP[] struHDGroupAttr = (NET_DVR_SINGLE_HDGROUP[])(new NET_DVR_SINGLE_HDGROUP()).toArray(16);
    }

    public static class NET_DVR_SCALECFG extends Structure {
        public int dwSize;
        public int dwMajorScale;
        public int dwMinorScale;
        public int[] dwRes = new int[2];
    }

    public static class NET_DVR_ALARMOUTCFG_V30 extends Structure {
        public int dwSize;
        public byte[] sAlarmOutName = new byte[32];
        public int dwAlarmOutDelay;
        public NET_DVR_SCHEDTIMEWEEK[] struAlarmOutTime = (NET_DVR_SCHEDTIMEWEEK[])(new NET_DVR_SCHEDTIMEWEEK()).toArray(7);
        public byte[] byRes = new byte[16];
    }

    public static class NET_DVR_ALARMOUTCFG extends Structure {
        public int dwSize;
        public byte[] sAlarmOutName = new byte[32];
        public int dwAlarmOutDelay;
        public NET_DVR_SCHEDTIMEWEEK[] struAlarmOutTime = (NET_DVR_SCHEDTIMEWEEK[])(new NET_DVR_SCHEDTIMEWEEK()).toArray(7);
    }

    public static class NET_DVR_PREVIEWCFG_V30 extends Structure {
        public int dwSize;
        public byte byPreviewNumber;
        public byte byEnableAudio;
        public short wSwitchTime;
        public byte[][] bySwitchSeq = new byte[8][32];
        public byte[] byRes = new byte[24];
    }

    public static class NET_DVR_PREVIEWCFG extends Structure {
        public int dwSize;
        public byte byPreviewNumber;
        public byte byEnableAudio;
        public short wSwitchTime;
        public byte[] bySwitchSeq = new byte[16];
    }

    public static class NET_DVR_VGAPARA extends Structure {
        public short wResolution;
        public short wFreq;
        public int dwBrightness;
    }

    public static class NET_DVR_MATRIXPARA_V30 extends Structure {
        public short[] wOrder = new short[32];
        public short wSwitchTime;
        public byte[] res = new byte[14];
    }

    public static class NET_DVR_MATRIXPARA extends Structure {
        public short wDisplayLogo;
        public short wDisplayOsd;
    }

    public static class NET_DVR_VOOUT extends Structure {
        public byte byVideoFormat;
        public byte byMenuAlphaValue;
        public short wScreenSaveTime;
        public short wVOffset;
        public short wBrightness;
        public byte byStartMode;
        public byte byEnableScaler;
    }

    public static class NET_DVR_VIDEOOUT_V30 extends Structure {
        public int dwSize;
        public NET_DVR_VOOUT[] struVOOut = (NET_DVR_VOOUT[])(new NET_DVR_VOOUT()).toArray(4);
        public NET_DVR_VGAPARA[] struVGAPara = (NET_DVR_VGAPARA[])(new NET_DVR_VGAPARA()).toArray(4);
        public NET_DVR_MATRIXPARA_V30[] struMatrixPara = (NET_DVR_MATRIXPARA_V30[])(new NET_DVR_MATRIXPARA_V30()).toArray(16);
        public byte[] byRes = new byte[16];
    }

    public static class NET_DVR_VIDEOOUT extends Structure {
        public int dwSize;
        public NET_DVR_VOOUT[] struVOOut = (NET_DVR_VOOUT[])(new NET_DVR_VOOUT()).toArray(2);
        public NET_DVR_VGAPARA[] struVGAPara = (NET_DVR_VGAPARA[])(new NET_DVR_VGAPARA()).toArray(1);
        public NET_DVR_MATRIXPARA struMatrixPara = new NET_DVR_MATRIXPARA();
    }

    public static class NET_DVR_USER_INFO_V30 extends Structure {
        public byte[] sUserName = new byte[32];
        public byte[] sPassword = new byte[16];
        public byte[] byLocalRight = new byte[32];
        public byte[] byRemoteRight = new byte[32];
        public byte[] byNetPreviewRight = new byte[64];
        public byte[] byLocalPlaybackRight = new byte[64];
        public byte[] byNetPlaybackRight = new byte[64];
        public byte[] byLocalRecordRight = new byte[64];
        public byte[] byNetRecordRight = new byte[64];
        public byte[] byLocalPTZRight = new byte[64];
        public byte[] byNetPTZRight = new byte[64];
        public byte[] byLocalBackupRight = new byte[64];
        public NET_DVR_IPADDR struUserIP = new NET_DVR_IPADDR();
        public byte[] byMACAddr = new byte[6];
        public byte byPriority;
        public byte[] byRes = new byte[17];
    }

    public static class NET_DVR_USER_INFO_EX extends Structure {
        public byte[] sUserName = new byte[32];
        public byte[] sPassword = new byte[16];
        public int[] dwLocalRight = new int[32];
        public int dwLocalPlaybackRight;
        public int[] dwRemoteRight = new int[32];
        public int dwNetPreviewRight;
        public int dwNetPlaybackRight;
        public byte[] sUserIP = new byte[16];
        public byte[] byMACAddr = new byte[6];
    }

    public static class NET_DVR_USER_INFO extends Structure {
        public byte[] sUserName = new byte[32];
        public byte[] sPassword = new byte[16];
        public int[] dwLocalRight = new int[32];
        public int[] dwRemoteRight = new int[32];
        public byte[] sUserIP = new byte[16];
        public byte[] byMACAddr = new byte[6];
    }

    public static class NET_DVR_USER_V30 extends Structure {
        public int dwSize;
        public NET_DVR_USER_INFO_V30[] struUser = (NET_DVR_USER_INFO_V30[])(new NET_DVR_USER_INFO_V30()).toArray(32);
    }

    public static class NET_DVR_USER_EX extends Structure {
        public int dwSize;
        public NET_DVR_USER_INFO_EX[] struUser = (NET_DVR_USER_INFO_EX[])(new NET_DVR_USER_INFO_EX()).toArray(16);
    }

    public static class NET_DVR_USER extends Structure {
        public int dwSize;
        public NET_DVR_USER_INFO[] struUser = (NET_DVR_USER_INFO[])(new NET_DVR_USER_INFO()).toArray(16);
    }

    public static class NET_DVR_EXCEPTION_V30 extends Structure {
        public int dwSize;
        public NET_DVR_HANDLEEXCEPTION_V30[] struExceptionHandleType = (NET_DVR_HANDLEEXCEPTION_V30[])(new NET_DVR_HANDLEEXCEPTION_V30()).toArray(32);
    }

    public static class NET_DVR_EXCEPTION extends Structure {
        public int dwSize;
        public NET_DVR_HANDLEEXCEPTION[] struExceptionHandleType = (NET_DVR_HANDLEEXCEPTION[])(new NET_DVR_HANDLEEXCEPTION()).toArray(16);
    }

    public static class NET_DVR_CHANNELSTATE_V30 extends Structure {
        public byte byRecordStatic;
        public byte bySignalStatic;
        public byte byHardwareStatic;
        public byte reservedData;
        public int dwBitRate;
        public int dwLinkNum;
        public NET_DVR_IPADDR[] struClientIP = (NET_DVR_IPADDR[])(new NET_DVR_IPADDR()).toArray(6);
        public int dwIPLinkNum;
        public byte[] byRes = new byte[12];
    }

    public static class NET_DVR_CHANNELSTATE extends Structure {
        public byte byRecordStatic;
        public byte bySignalStatic;
        public byte byHardwareStatic;
        public byte reservedData;
        public int dwBitRate;
        public int dwLinkNum;
        public int[] dwClientIP = new int[6];
    }

    public static class NET_DVR_DISKSTATE extends Structure {
        public int dwVolume;
        public int dwFreeSpace;
        public int dwHardDiskStatic;
    }

    public static class NET_DVR_WORKSTATE_V30 extends Structure {
        public int dwDeviceStatic;
        public NET_DVR_DISKSTATE[] struHardDiskStatic = (NET_DVR_DISKSTATE[])(new NET_DVR_DISKSTATE()).toArray(33);
        public NET_DVR_CHANNELSTATE_V30[] struChanStatic = (NET_DVR_CHANNELSTATE_V30[])(new NET_DVR_CHANNELSTATE_V30()).toArray(64);
        public byte[] byAlarmInStatic = new byte[160];
        public byte[] byAlarmOutStatic = new byte[96];
        public int dwLocalDisplay;
        public byte[] byAudioChanStatus = new byte[2];
        public byte[] byRes = new byte[10];
    }

    public static class NET_DVR_WORKSTATE extends Structure {
        public int dwDeviceStatic;
        public NET_DVR_DISKSTATE[] struHardDiskStatic = (NET_DVR_DISKSTATE[])(new NET_DVR_DISKSTATE()).toArray(16);
        public NET_DVR_CHANNELSTATE[] struChanStatic = (NET_DVR_CHANNELSTATE[])(new NET_DVR_CHANNELSTATE()).toArray(16);
        public byte[] byAlarmInStatic = new byte[16];
        public byte[] byAlarmOutStatic = new byte[4];
        public int dwLocalDisplay;
    }

    public static class NET_DVR_LOG_V30 extends Structure {
        public NET_DVR_TIME strLogTime = new NET_DVR_TIME();
        public int dwMajorType;
        public int dwMinorType;
        public byte[] sPanelUser = new byte[16];
        public byte[] sNetUser = new byte[16];
        public NET_DVR_IPADDR struRemoteHostAddr = new NET_DVR_IPADDR();
        public int dwParaType;
        public int dwChannel;
        public int dwDiskNumber;
        public int dwAlarmInPort;
        public int dwAlarmOutPort;
        public int dwInfoLen;
        public byte[] sInfo = new byte[11840];
    }

    public static class NET_DVR_LOG extends Structure {
        public NET_DVR_TIME strLogTime = new NET_DVR_TIME();
        public int dwMajorType;
        public int dwMinorType;
        public byte[] sPanelUser = new byte[16];
        public byte[] sNetUser = new byte[16];
        public byte[] sRemoteHostAddr = new byte[16];
        public int dwParaType;
        public int dwChannel;
        public int dwDiskNumber;
        public int dwAlarmInPort;
        public int dwAlarmOutPort;
    }

    public static class NET_DVR_ALARMOUTSTATUS_V30 extends Structure {
        public byte[] Output = new byte[96];
    }

    public static class NET_DVR_ALARMOUTSTATUS extends Structure {
        public byte[] Output = new byte[4];
    }

    public static class NET_DVR_TRADEINFO extends Structure {
        public short m_Year;
        public short m_Month;
        public short m_Day;
        public short m_Hour;
        public short m_Minute;
        public short m_Second;
        public byte[] DeviceName = new byte[24];
        public int dwChannelNumer;
        public byte[] CardNumber = new byte[32];
        public byte[] cTradeType = new byte[12];
        public int dwCash;
    }

    public static class NET_DVR_FRAMETYPECODE extends Structure {
        public byte[] code = new byte[12];
    }

    public static class NET_DVR_FRAMEFORMAT_V30 extends Structure {
        public int dwSize;
        public NET_DVR_IPADDR struATMIP = new NET_DVR_IPADDR();
        public int dwATMType;
        public int dwInputMode;
        public int dwFrameSignBeginPos;
        public int dwFrameSignLength;
        public byte[] byFrameSignContent = new byte[12];
        public int dwCardLengthInfoBeginPos;
        public int dwCardLengthInfoLength;
        public int dwCardNumberInfoBeginPos;
        public int dwCardNumberInfoLength;
        public int dwBusinessTypeBeginPos;
        public int dwBusinessTypeLength;
        public NET_DVR_FRAMETYPECODE[] frameTypeCode = (NET_DVR_FRAMETYPECODE[])(new NET_DVR_FRAMETYPECODE()).toArray(10);
        public short wATMPort;
        public short wProtocolType;
        public byte[] byRes = new byte[24];
    }

    public static class NET_DVR_FRAMEFORMAT extends Structure {
        public int dwSize;
        public byte[] sATMIP = new byte[16];
        public int dwATMType;
        public int dwInputMode;
        public int dwFrameSignBeginPos;
        public int dwFrameSignLength;
        public byte[] byFrameSignContent = new byte[12];
        public int dwCardLengthInfoBeginPos;
        public int dwCardLengthInfoLength;
        public int dwCardNumberInfoBeginPos;
        public int dwCardNumberInfoLength;
        public int dwBusinessTypeBeginPos;
        public int dwBusinessTypeLength;
        public NET_DVR_FRAMETYPECODE[] frameTypeCode = (NET_DVR_FRAMETYPECODE[])(new NET_DVR_FRAMETYPECODE()).toArray(10);
    }

    public static class NET_DVR_FTPTYPECODE extends Structure {
        public byte[] sFtpType = new byte[32];
        public byte[] sFtpCode = new byte[8];
    }

    public static class NET_DVR_FRAMEFORMAT_EX extends Structure {
        public int dwSize;
        public byte[] sATMIP = new byte[16];
        public int dwATMType;
        public int dwInputMode;
        public int dwFrameSignBeginPos;
        public int dwFrameSignLength;
        public byte[] byFrameSignContent = new byte[12];
        public int dwCardLengthInfoBeginPos;
        public int dwCardLengthInfoLength;
        public int dwCardNumberInfoBeginPos;
        public int dwCardNumberInfoLength;
        public int dwBusinessTypeBeginPos;
        public int dwBusinessTypeLength;
        public NET_DVR_FRAMETYPECODE[] frameTypeCode = (NET_DVR_FRAMETYPECODE[])(new NET_DVR_FRAMETYPECODE()).toArray(10);
        public byte[] sFTPIP = new byte[16];
        public byte[] byFtpUsername = new byte[32];
        public byte[] byFtpPasswd = new byte[16];
        public byte[] sDirName = new byte[32];
        public int dwATMSrvType;
        public int dwTimeSpace;
        public NET_DVR_FTPTYPECODE[] sFtpTypeCodeOp = (NET_DVR_FTPTYPECODE[])(new NET_DVR_FTPTYPECODE()).toArray(300);
        public int dwADPlay;
        public int dwNewPort;
    }

    public static class Bind extends Structure {
        public boolean bind;
    }

    public static class NET_DVR_DECODERINFO extends Structure {
        public byte[] byEncoderIP = new byte[16];
        public byte[] byEncoderUser = new byte[16];
        public byte[] byEncoderPasswd = new byte[16];
        public byte bySendMode;
        public byte byEncoderChannel;
        public short wEncoderPort;
        public byte[] reservedData = new byte[4];
    }

    public static class NET_DVR_DECODERSTATE extends Structure {
        public byte[] byEncoderIP = new byte[16];
        public byte[] byEncoderUser = new byte[16];
        public byte[] byEncoderPasswd = new byte[16];
        public byte byEncoderChannel;
        public byte bySendMode;
        public short wEncoderPort;
        public int dwConnectState;
        public byte[] reservedData = new byte[4];
    }

    public static class NET_DVR_DECCHANINFO extends Structure {
        public byte[] sDVRIP = new byte[16];
        public short wDVRPort;
        public byte[] sUserName = new byte[32];
        public byte[] sPassword = new byte[16];
        public byte byChannel;
        public byte byLinkMode;
        public byte byLinkType;
    }

    public static class NET_DVR_DECINFO extends Structure {
        public byte byPoolChans;
        public NET_DVR_DECCHANINFO[] struchanConInfo = (NET_DVR_DECCHANINFO[])(new NET_DVR_DECCHANINFO()).toArray(4);
        public byte byEnablePoll;
        public byte byPoolTime;
    }

    public static class NET_DVR_DECCFG extends Structure {
        public int dwSize;
        public int dwDecChanNum;
        public NET_DVR_DECINFO[] struDecInfo = (NET_DVR_DECINFO[])(new NET_DVR_DECINFO()).toArray(4);
    }

    public static class NET_DVR_PORTINFO extends Structure {
        public int dwEnableTransPort;
        public byte[] sDecoderIP = new byte[16];
        public short wDecoderPort;
        public short wDVRTransPort;
        public byte[] cReserve = new byte[4];
    }

    public static class NET_DVR_PORTCFG extends Structure {
        public int dwSize;
        public NET_DVR_PORTINFO[] struTransPortInfo = (NET_DVR_PORTINFO[])(new NET_DVR_PORTINFO()).toArray(2);
    }

    public static class NET_DVR_PLAYREMOTEFILE extends Structure {
        public int dwSize;
        public byte[] sDecoderIP = new byte[16];
        public short wDecoderPort;
        public short wLoadMode;
        public byte[] byFile = new byte[100];

        public static class mode_size extends Union {
            public byte[] byFile = new byte[100];

            public static class bytime extends Structure {
                public int dwChannel;
                public byte[] sUserName = new byte[32];
                public byte[] sPassword = new byte[16];
                public NET_DVR_TIME struStartTime = new NET_DVR_TIME();
                public NET_DVR_TIME struStopTime = new NET_DVR_TIME();
            }
        }
    }

    public static class NET_DVR_DECCHANSTATUS extends Structure {
        public int dwWorkType;
        public byte[] sDVRIP = new byte[16];
        public short wDVRPort;
        public byte byChannel;
        public byte byLinkMode;
        public int dwLinkType;
        public byte[] sUserName = new byte[32];
        public byte[] sPassword = new byte[16];
        public byte[] cReserve = new byte[52];

        public static class objectInfo extends Union {
            public static class userInfo extends Structure {
                public byte[] sUserName = new byte[32];
                public byte[] sPassword = new byte[16];
                public byte[] cReserve = new byte[52];
            }

            public static class fileInfo extends Structure {
                public byte[] fileName = new byte[100];
            }

            public static class timeInfo extends Structure {
                public int dwChannel;
                public byte[] sUserName = new byte[32];
                public byte[] sPassword = new byte[16];
                public NET_DVR_TIME struStartTime = new NET_DVR_TIME();
                public NET_DVR_TIME struStopTime = new NET_DVR_TIME();
            }
        }
    }

    public static class NET_DVR_DECSTATUS extends Structure {
        public int dwSize;
        public NET_DVR_DECCHANSTATUS[] struDecState = (NET_DVR_DECCHANSTATUS[])(new NET_DVR_DECCHANSTATUS()).toArray(4);
    }

    public static class NET_DVR_SHOWSTRINGINFO extends Structure {
        public short wShowString;
        public short wStringSize;
        public short wShowStringTopLeftX;
        public short wShowStringTopLeftY;
        public byte[] sString = new byte[44];
    }

    public static class NET_DVR_SHOWSTRING_V30 extends Structure {
        public int dwSize;
        public NET_DVR_SHOWSTRINGINFO[] struStringInfo = (NET_DVR_SHOWSTRINGINFO[])(new NET_DVR_SHOWSTRINGINFO()).toArray(8);
    }

    public static class NET_DVR_SHOWSTRING_EX extends Structure {
        public int dwSize;
        public NET_DVR_SHOWSTRINGINFO[] struStringInfo = (NET_DVR_SHOWSTRINGINFO[])(new NET_DVR_SHOWSTRINGINFO()).toArray(8);
    }

    public static class NET_DVR_SHOWSTRING extends Structure {
        public int dwSize;
        public NET_DVR_SHOWSTRINGINFO[] struStringInfo = (NET_DVR_SHOWSTRINGINFO[])(new NET_DVR_SHOWSTRINGINFO()).toArray(4);
    }

    public static class NET_DVR_SENDER extends Structure {
        public byte[] sName = new byte[32];
        public byte[] sAddress = new byte[48];
    }

    public static class NET_DVRRECEIVER extends Structure {
        public byte[] sName = new byte[32];
        public byte[] sAddress = new byte[48];
    }

    public static class NET_DVR_EMAILCFG_V30 extends Structure {
        public int dwSize;
        public byte[] sAccount = new byte[32];
        public byte[] sPassword = new byte[32];
        public NET_DVR_SENDER struSender = new NET_DVR_SENDER();
        public byte[] sSmtpServer = new byte[48];
        public byte[] sPop3Server = new byte[48];
        public NET_DVRRECEIVER[] struReceiver = (NET_DVRRECEIVER[])(new NET_DVRRECEIVER()).toArray(3);
        public byte byAttachment;
        public byte bySmtpServerVerify;
        public byte byMailInterval;
        public byte[] res = new byte[77];
    }

    public static class NET_DVR_CRUISE_PARA extends Structure {
        public int dwSize;
        public byte[] byPresetNo = new byte[32];
        public byte[] byCruiseSpeed = new byte[32];
        public short[] wDwellTime = new short[32];
        public byte[] byEnableThisCruise;
        public byte[] res = new byte[15];
    }

    public static class NET_DVR_TIMEPOINT extends Structure {
        public int dwMonth;
        public int dwWeekNo;
        public int dwWeekDate;
        public int dwHour;
        public int dwMin;
    }

    public static class NET_DVR_ZONEANDDST extends Structure {
        public int dwSize;
        public byte[] byRes1 = new byte[16];
        public int dwEnableDST;
        public byte byDSTBias;
        public byte[] byRes2 = new byte[3];
        public NET_DVR_TIMEPOINT struBeginPoint = new NET_DVR_TIMEPOINT();
        public NET_DVR_TIMEPOINT struEndPoint = new NET_DVR_TIMEPOINT();
    }

    public static class NET_DVR_JPEGPARA extends Structure {
        public short wPicSize;
        public short wPicQuality;
    }

    public static class NET_DVR_AUXOUTCFG extends Structure {
        public int dwSize;
        public int dwAlarmOutChan;
        public int dwAlarmChanSwitchTime;
        public int[] dwAuxSwitchTime = new int[4];
        public byte[][] byAuxOrder = new byte[4][16];
    }

    public static class NET_DVR_NTPPARA extends Structure {
        public byte[] sNTPServer = new byte[64];
        public short wInterval;
        public byte byEnableNTP;
        public byte cTimeDifferenceH;
        public byte cTimeDifferenceM;
        public byte res1;
        public short wNtpPort;
        public byte[] res2 = new byte[8];
    }

    public static class NET_DVR_DDNSPARA extends Structure {
        public byte[] sUsername = new byte[32];
        public byte[] sPassword = new byte[16];
        public byte[] sDomainName = new byte[64];
        public byte byEnableDDNS;
        public byte[] res = new byte[15];
    }

    public static class NET_DVR_DDNSPARA_EX extends Structure {
        public byte byHostIndex;
        public byte byEnableDDNS;
        public short wDDNSPort;
        public byte[] sUsername = new byte[32];
        public byte[] sPassword = new byte[16];
        public byte[] sDomainName = new byte[64];
        public byte[] sServerName = new byte[64];
        public byte[] byRes = new byte[16];
    }

    public static class NET_DVR_DDNS extends Structure {
        public byte[] sUsername = new byte[32];
        public byte[] sPassword = new byte[16];
        public byte[] sDomainName = new byte[64];
        public byte[] sServerName = new byte[64];
        public short wDDNSPort;
        public byte[] byRes = new byte[10];
    }

    public static class NET_DVR_DDNSPARA_V30 extends Structure {
        public byte byEnableDDNS;
        public byte byHostIndex;
        public byte[] byRes1 = new byte[2];
        public NET_DVR_DDNS[] struDDNS = (NET_DVR_DDNS[])(new NET_DVR_DDNS()).toArray(10);
        public byte[] byRes2 = new byte[16];
    }

    public static class NET_DVR_EMAILPARA extends Structure {
        public byte[] sUsername = new byte[64];
        public byte[] sPassword = new byte[64];
        public byte[] sSmtpServer = new byte[64];
        public byte[] sPop3Server = new byte[64];
        public byte[] sMailAddr = new byte[64];
        public byte[] sEventMailAddr1 = new byte[64];
        public byte[] sEventMailAddr2 = new byte[64];
        public byte[] res = new byte[16];
    }

    public static class NET_DVR_NETAPPCFG extends Structure {
        public int dwSize;
        public byte[] sDNSIp = new byte[16];
        public NET_DVR_NTPPARA struNtpClientParam = new NET_DVR_NTPPARA();
        public NET_DVR_DDNSPARA struDDNSClientParam = new NET_DVR_DDNSPARA();
        public byte[] res = new byte[464];
    }

    public static class NET_DVR_SINGLE_NFS extends Structure {
        public byte[] sNfsHostIPAddr = new byte[16];
        public byte[] sNfsDirectory = new byte[128];
    }

    public static class NET_DVR_NFSCFG extends Structure {
        public int dwSize;
        public NET_DVR_SINGLE_NFS[] struNfsDiskParam = (NET_DVR_SINGLE_NFS[])(new NET_DVR_SINGLE_NFS()).toArray(8);
    }

    public static class NET_DVR_CRUISE_POINT extends Structure {
        public byte PresetNum;
        public byte Dwell;
        public byte Speed;
        public byte Reserve;
    }

    public static class NET_DVR_CRUISE_RET extends Structure {
        public NET_DVR_CRUISE_POINT[] struCruisePoint = (NET_DVR_CRUISE_POINT[])(new NET_DVR_CRUISE_POINT()).toArray(32);
    }

    public static class NET_DVR_NETCFG_OTHER extends Structure {
        public int dwSize;
        public byte[] sFirstDNSIP = new byte[16];
        public byte[] sSecondDNSIP = new byte[16];
        public byte[] sRes = new byte[32];
    }

    public static class NET_DVR_MATRIX_DECINFO extends Structure {
        public byte[] sDVRIP = new byte[16];
        public short wDVRPort;
        public byte byChannel;
        public byte byTransProtocol;
        public byte byTransMode;
        public byte[] byRes = new byte[3];
        public byte[] sUserName = new byte[32];
        public byte[] sPassword = new byte[16];
    }

    public static class NET_DVR_MATRIX_DYNAMIC_DEC extends Structure {
        public int dwSize;
        public NET_DVR_MATRIX_DECINFO struDecChanInfo = new NET_DVR_MATRIX_DECINFO();
    }

    public static class NET_DVR_MATRIX_DEC_CHAN_STATUS extends Structure {
        public int dwSize;
        public int dwIsLinked;
        public int dwStreamCpRate;
        public byte[] cRes = new byte[64];
    }

    public static class NET_DVR_MATRIX_DEC_CHAN_INFO extends Structure {
        public int dwSize;
        public NET_DVR_MATRIX_DECINFO struDecChanInfo = new NET_DVR_MATRIX_DECINFO();
        public int dwDecState;
        public NET_DVR_TIME StartTime = new NET_DVR_TIME();
        public NET_DVR_TIME StopTime = new NET_DVR_TIME();
        public byte[] sFileName = new byte[128];
    }

    public static class NET_DVR_MATRIX_DECCHANINFO extends Structure {
        public int dwEnable;
        public NET_DVR_MATRIX_DECINFO struDecChanInfo = new NET_DVR_MATRIX_DECINFO();
    }

    public static class NET_DVR_MATRIX_LOOP_DECINFO extends Structure {
        public int dwSize;
        public int dwPoolTime;
        public NET_DVR_MATRIX_DECCHANINFO[] struchanConInfo = (NET_DVR_MATRIX_DECCHANINFO[])(new NET_DVR_MATRIX_DECCHANINFO()).toArray(16);
    }

    public static class NET_DVR_MATRIX_ROW_ELEMENT extends Structure {
        public byte[] sSurvChanName = new byte[128];
        public int dwRowNum;
        public NET_DVR_MATRIX_DECINFO struDecChanInfo = new NET_DVR_MATRIX_DECINFO();
    }

    public static class NET_DVR_MATRIX_ROW_INDEX extends Structure {
        public byte[] sSurvChanName = new byte[128];
        public int dwRowNum;
    }

    public static class NET_DVR_MATRIX_COLUMN_ELEMENT extends Structure {
        public int dwLocalDispChanNum;
        public int dwGlobalDispChanNum;
        public int dwRes;
    }

    public static class NET_DVR_MATRIX_GLOBAL_COLUMN_ELEMENT extends Structure {
        public int dwConflictTag;
        public int dwConflictGloDispChan;
        public NET_DVR_MATRIX_COLUMN_ELEMENT struColumnInfo = new NET_DVR_MATRIX_COLUMN_ELEMENT();
    }

    public static class NET_DVR_MATRIX_ROW_COLUMN_LINK extends Structure {
        public int dwSize;
        public int dwRowNum;
        public byte[] sSurvChanName = new byte[128];
        public int dwSurvNum;
        public int dwGlobalDispChanNum;
        public int dwLocalDispChanNum;
        public int dwTimeSel;
        public NET_DVR_TIME StartTime = new NET_DVR_TIME();
        public NET_DVR_TIME StopTime = new NET_DVR_TIME();
        public byte[] sFileName = new byte[128];
    }

    public static class NET_DVR_MATRIX_PREVIEW_DISP_CHAN extends Structure {
        public int dwSize;
        public int dwGlobalDispChanNum;
        public int dwLocalDispChanNum;
    }

    public static class NET_DVR_MATRIX_LOOP_PLAY_SET extends Structure {
        public int dwSize;
        public int dwLocalDispChanNum;
        public int dwGlobalDispChanNum;
        public int dwCycTimeInterval;
    }

    public static class NET_DVR_MATRIX_LOCAL_HOST_INFO extends Structure {
        public int dwSize;
        public int dwLocalHostProperty;
        public int dwIsIsolated;
        public int dwLocalMatrixHostPort;
        public byte[] byLocalMatrixHostUsrName = new byte[32];
        public byte[] byLocalMatrixHostPasswd = new byte[16];
        public int dwLocalMatrixCtrlMedia;
        public byte[] sMatrixCenterIP = new byte[16];
        public int dwMatrixCenterPort;
        public byte[] byMatrixCenterUsrName = new byte[32];
        public byte[] byMatrixCenterPasswd = new byte[16];
    }

    public static class TTY_CONFIG extends Structure {
        public byte baudrate;
        public byte databits;
        public byte stopbits;
        public byte parity;
        public byte flowcontrol;
        public byte[] res = new byte[3];
    }

    public static class NET_DVR_MATRIX_TRAN_CHAN_INFO extends Structure {
        public byte byTranChanEnable;
        public byte byLocalSerialDevice;
        public byte byRemoteSerialDevice;
        public byte res1;
        public byte[] sRemoteDevIP = new byte[16];
        public short wRemoteDevPort;
        public byte[] res2 = new byte[2];
        public TTY_CONFIG RemoteSerialDevCfg = new TTY_CONFIG();
    }

    public static class NET_DVR_MATRIX_TRAN_CHAN_CONFIG extends Structure {
        public int dwSize;
        public byte by232IsDualChan;
        public byte by485IsDualChan;
        public byte[] res = new byte[2];
        public NET_DVR_MATRIX_TRAN_CHAN_INFO[] struTranInfo = (NET_DVR_MATRIX_TRAN_CHAN_INFO[])(new NET_DVR_MATRIX_TRAN_CHAN_INFO()).toArray(64);
    }

    public static class NET_DVR_MATRIX_DEC_REMOTE_PLAY extends Structure {
        public int dwSize;
        public byte[] sDVRIP = new byte[16];
        public short wDVRPort;
        public byte byChannel;
        public byte byReserve;
        public byte[] sUserName = new byte[32];
        public byte[] sPassword = new byte[16];
        public int dwPlayMode;
        public NET_DVR_TIME StartTime = new NET_DVR_TIME();
        public NET_DVR_TIME StopTime = new NET_DVR_TIME();
        public byte[] sFileName = new byte[128];
    }

    public static class NET_DVR_MATRIX_DEC_REMOTE_PLAY_CONTROL extends Structure {
        public int dwSize;
        public int dwPlayCmd;
        public int dwCmdParam;
    }

    public static class NET_DVR_MATRIX_DEC_REMOTE_PLAY_STATUS extends Structure {
        public int dwSize;
        public int dwCurMediaFileLen;
        public int dwCurMediaFilePosition;
        public int dwCurMediaFileDuration;
        public int dwCurPlayTime;
        public int dwCurMediaFIleFrames;
        public int dwCurDataType;
        public byte[] res = new byte[72];
    }

    public static class NET_DVR_MATRIX_PASSIVEMODE extends Structure {
        public short wTransProtol;
        public short wPassivePort;
        public byte[] sMcastIP = new byte[16];
        public byte[] res = new byte[8];
    }

    public static class NET_DVR_EMAILCFG extends Structure {
        public int dwSize;
        public byte[] sUserName = new byte[32];
        public byte[] sPassWord = new byte[32];
        public byte[] sFromName = new byte[32];
        public byte[] sFromAddr = new byte[48];
        public byte[] sToName1 = new byte[32];
        public byte[] sToName2 = new byte[32];
        public byte[] sToAddr1 = new byte[48];
        public byte[] sToAddr2 = new byte[48];
        public byte[] sEmailServer = new byte[32];
        public byte byServerType;
        public byte byUseAuthen;
        public byte byAttachment;
        public byte byMailinterval;
    }

    public static class NET_DVR_COMPRESSIONCFG_NEW extends Structure {
        public int dwSize;
        public NET_DVR_COMPRESSION_INFO_EX struLowCompression = new NET_DVR_COMPRESSION_INFO_EX();
        public NET_DVR_COMPRESSION_INFO_EX struEventCompression = new NET_DVR_COMPRESSION_INFO_EX();
    }

    public static class NET_DVR_PTZPOS extends Structure {
        public short wAction;
        public short wPanPos;
        public short wTiltPos;
        public short wZoomPos;
    }

    public static class NET_DVR_PTZSCOPE extends Structure {
        public short wPanPosMin;
        public short wPanPosMax;
        public short wTiltPosMin;
        public short wTiltPosMax;
        public short wZoomPosMin;
        public short wZoomPosMax;
    }

    public static class NET_DVR_RTSPCFG extends Structure {
        public int dwSize;
        public short wPort;
        public byte[] byReserve = new byte[54];
    }

    public static class DEMO_CHANNEL_TYPE {
        public static final int DEMO_CHANNEL_TYPE_INVALID = -1;
        public static final int DEMO_CHANNEL_TYPE_ANALOG = 0;
        public static final int DEMO_CHANNEL_TYPE_IP = 1;
        public static final int DEMO_CHANNEL_TYPE_MIRROR = 2;
    }

    public static class STRU_CHANNEL_INFO extends Structure {
        public int iDeviceIndex;
        public int iChanIndex;
        public int iChanType;
        public int iChannelNO;
        public byte[] chChanName = new byte[100];
        public int dwProtocol;
        public int dwStreamType;
        public int dwLinkMode;
        public boolean bPassbackRecord;
        public int dwPreviewMode;
        public int iPicResolution;
        public int iPicQuality;
        public NativeLong lRealHandle;
        public boolean bLocalManualRec;
        public boolean bAlarm;
        public boolean bEnable;
        public int dwImageType;
        public byte[] chAccessChanIP = new byte[16];
        public int nPreviewProtocolType;
        public Pointer pNext;

        public void init() {
            this.iDeviceIndex = -1;
            this.iChanIndex = -1;
            this.iChannelNO = -1;
            this.iChanType = -1;
            this.chChanName = null;
            this.dwProtocol = 0;
            this.dwStreamType = 0;
            this.dwLinkMode = 0;
            this.iPicResolution = 0;
            this.iPicQuality = 2;
            this.lRealHandle = new NativeLong(-1L);
            this.bLocalManualRec = false;
            this.bAlarm = false;
            this.bEnable = false;
            this.dwImageType = 6;
            this.chAccessChanIP = null;
            this.pNext = null;
            this.dwPreviewMode = 0;
            this.bPassbackRecord = false;
            this.nPreviewProtocolType = 0;
        }
    }

    public static class NET_DVR_IPDEVINFO_V31 extends Structure {
        public byte byEnable;
        public byte byProType;
        public byte byEnableQuickAdd;
        public byte byRes1;
        public byte[] sUserName = new byte[32];
        public byte[] sPassword = new byte[16];
        public byte[] byDomain = new byte[64];
        public NET_DVR_IPADDR struIP = new NET_DVR_IPADDR();
        public short wDVRPort;
        public byte[] szDeviceID = new byte[32];
        public byte[] byRes2 = new byte[2];
    }

    public static class NET_DVR_IPSERVER_STREAM extends Structure {
        public byte[] byEnable;
        public byte[] byRes = new byte[3];
        public NET_DVR_IPADDR struIPServer = new NET_DVR_IPADDR();
        public short wPort;
        public short wDvrNameLen;
        public byte[] byDVRName = new byte[32];
        public short wDVRSerialLen;
        public short[] byRes1 = new short[2];
        public byte[] byDVRSerialNumber = new byte[48];
        public byte[] byUserName = new byte[32];
        public byte[] byPassWord = new byte[16];
        public byte byChannel;
        public byte[] byRes2 = new byte[11];
    }

    public static class NET_DVR_STREAM_MEDIA_SERVER_CFG extends Structure {
        public byte byValid;
        public byte[] byRes1 = new byte[3];
        public NET_DVR_IPADDR struDevIP = new NET_DVR_IPADDR();
        public short wDevPort;
        public byte byTransmitType;
        public byte[] byRes2 = new byte[69];
    }

    public static class NET_DVR_DEV_CHAN_INFO extends Structure {
        public NET_DVR_IPADDR struIP = new NET_DVR_IPADDR();
        public short wDVRPort;
        public byte byChannel;
        public byte byTransProtocol;
        public byte byTransMode;
        public byte byFactoryType;
        public byte byDeviceType;
        public byte byDispChan;
        public byte bySubDispChan;
        public byte byResolution;
        public byte[] byRes = new byte[2];
        public byte[] byDomain = new byte[64];
        public byte[] sUserName = new byte[32];
        public byte[] sPassword = new byte[16];
    }

    public static class NET_DVR_PU_STREAM_CFG extends Structure {
        public int dwSize;
        public NET_DVR_STREAM_MEDIA_SERVER_CFG struStreamMediaSvrCfg = new NET_DVR_STREAM_MEDIA_SERVER_CFG();
        public NET_DVR_DEV_CHAN_INFO struDevChanInfo = new NET_DVR_DEV_CHAN_INFO();
    }

    public static class NET_DVR_DDNS_STREAM_CFG extends Structure {
        public byte byEnable;
        public byte[] byRes1 = new byte[3];
        public NET_DVR_IPADDR struStreamServer = new NET_DVR_IPADDR();
        public short wStreamServerPort;
        public byte byStreamServerTransmitType;
        public byte byRes2;
        public NET_DVR_IPADDR struIPServer = new NET_DVR_IPADDR();
        public short wIPServerPort;
        public byte[] byRes3 = new byte[2];
        public byte[] sDVRName = new byte[32];
        public short wDVRNameLen;
        public short wDVRSerialLen;
        public byte[] sDVRSerialNumber = new byte[48];
        public byte[] sUserName = new byte[32];
        public byte[] sPassWord = new byte[16];
        public short wDVRPort;
        public byte[] byRes4 = new byte[2];
        public byte byChannel;
        public byte byTransProtocol;
        public byte byTransMode;
        public byte byFactoryType;
    }

    public static class NET_DVR_PU_STREAM_URL extends Structure {
        public byte byEnable;
        public byte[] strURL = new byte[240];
        public byte byTransPortocol;
        public short wIPID;
        public byte byChannel;
        public byte[] byRes = new byte[7];
    }

    public static class NET_DVR_HKDDNS_STREAM extends Structure {
        public byte byEnable;
        public byte[] byRes = new byte[3];
        public byte[] byDDNSDomain = new byte[64];
        public short wPort;
        public short wAliasLen;
        public byte[] byAlias = new byte[32];
        public short wDVRSerialLen;
        public byte[] byRes1 = new byte[2];
        public byte[] byDVRSerialNumber = new byte[48];
        public byte[] byUserName = new byte[32];
        public byte[] byPassWord = new byte[16];
        public byte byChannel;
        public byte[] byRes2 = new byte[11];
    }

    public static class NET_DVR_IPCHANINFO_V40 extends Structure {
        public byte byEnable;
        public byte byRes1;
        public short wIPID;
        public int dwChannel;
        public byte byTransProtocol;
        public byte byTransMode;
        public byte byFactoryType;
        public byte[] byRes = new byte[241];
    }

    public static class NET_DVR_GET_STREAM_UNION extends Union {
        public NET_DVR_IPCHANINFO struChanInfo = new NET_DVR_IPCHANINFO();
        public NET_DVR_IPSERVER_STREAM struIPServerStream = new NET_DVR_IPSERVER_STREAM();
        public NET_DVR_PU_STREAM_CFG struPUStream = new NET_DVR_PU_STREAM_CFG();
        public NET_DVR_DDNS_STREAM_CFG struDDNSStream = new NET_DVR_DDNS_STREAM_CFG();
        public NET_DVR_PU_STREAM_URL struStreamUrl = new NET_DVR_PU_STREAM_URL();
        public NET_DVR_HKDDNS_STREAM struHkDDNSStream = new NET_DVR_HKDDNS_STREAM();
        public NET_DVR_IPCHANINFO_V40 struIPChan = new NET_DVR_IPCHANINFO_V40();
    }

    public static class NET_DVR_STREAM_MODE extends Structure {
        public byte byGetStreamType;
        public byte[] byRes = new byte[3];
        public NET_DVR_GET_STREAM_UNION uGetStream;
    }

    public static class NET_DVR_IPPARACFG_V40 extends Structure {
        public int dwSize;
        public int dwGroupNum;
        public int dwAChanNum;
        public int dwDChanNum;
        public int dwStartDChan;
        public byte[] byAnalogChanEnable = new byte[64];
        public NET_DVR_IPDEVINFO_V31[] struIPDevInfo = (NET_DVR_IPDEVINFO_V31[])(new NET_DVR_IPDEVINFO_V31()).toArray(64);
        public NET_DVR_STREAM_MODE[] struStreamMode = (NET_DVR_STREAM_MODE[])(new NET_DVR_STREAM_MODE()).toArray(64);
        public byte[] byRes2 = new byte[20];
    }

    public static class NET_DVR_IPALARMININFO_V40 extends Structure {
        public int dwIPID;
        public int dwAlarmIn;
        public byte[] byRes = new byte[32];
    }

    public static class NET_DVR_IPALARMINCFG_V40 extends Structure {
        public int dwSize;
        public int dwCurIPAlarmInNum;
        public NET_DVR_IPALARMININFO_V40[] struIPAlarmInInfo = (NET_DVR_IPALARMININFO_V40[])(new NET_DVR_IPALARMININFO_V40()).toArray(4096);
        public byte[] byRes = new byte[256];
    }

    public static class NET_DVR_IPALARMOUTINFO_V40 extends Structure {
        public int dwIPID;
        public int dwAlarmOut;
        public byte[] byRes = new byte[32];
    }

    public static class NET_DVR_IPALARMOUTCFG_V40 extends Structure {
        public int dwSize;
        public int dwCurIPAlarmOutNum;
        public NET_DVR_IPALARMOUTINFO_V40[] struIPAlarmOutInfo = (NET_DVR_IPALARMOUTINFO_V40[])(new NET_DVR_IPALARMOUTINFO_V40()).toArray(4096);
        public byte[] byRes = new byte[256];
    }

    public static class PASSIVEDECODE_CHANINFO extends Structure {
        public NativeLong lPassiveHandle;
        public NativeLong lRealHandle;
        public NativeLong lUserID;
        public NativeLong lSel;
        public Pointer hFileThread;
        public Pointer hFileHandle;
        public Pointer hExitThread;
        public Pointer hThreadExit;
        String strRecordFilePath;

        public void init() {
            this.lPassiveHandle = new NativeLong(-1L);
            this.lRealHandle = new NativeLong(-1L);
            this.lUserID = new NativeLong(-1L);
            this.lSel = new NativeLong(-1L);
            this.hFileThread = null;
            this.hFileHandle = null;
            this.hExitThread = null;
            this.hThreadExit = null;
            this.strRecordFilePath = null;
        }
    }

    public static class NET_DVR_DEVICEINFO extends Structure {
        public byte[] sSerialNumber = new byte[48];
        public byte byAlarmInPortNum;
        public byte byAlarmOutPortNum;
        public byte byDiskNum;
        public byte byDVRType;
        public byte byChanNum;
        public byte byStartChan;
    }

    public static class NET_DVR_DEVICEINFO_V30 extends Structure {
        public byte[] sSerialNumber = new byte[48];
        public byte byAlarmInPortNum;
        public byte byAlarmOutPortNum;
        public byte byDiskNum;
        public byte byDVRType;
        public byte byChanNum;
        public byte byStartChan;
        public byte byAudioChanNum;
        public byte byIPChanNum;
        public byte[] byRes1 = new byte[24];

        @Override
        protected List<String> getFieldOrder() {
            return Arrays.asList(
                    "sSerialNumber",
                    "byAlarmInPortNum",
                    "byAlarmOutPortNum",
                    "byDiskNum",
                    "byDVRType",
                    "byChanNum",
                    "byStartChan",
                    "byAudioChanNum",
                    "byIPChanNum",
                    "byRes1"
            );
        }
    }


    public static class NET_DVR_USER_LOGIN_INFO extends Structure {
        public byte[] sDeviceAddress = new byte[129];
        public byte byUseTransport;
        public short wPort;
        public byte[] sUserName = new byte[64];
        public byte[] sPassword = new byte[64];
        public FLoginResultCallBack cbLoginResult;
        public Pointer pUser; // <<<<< MAKE SURE THIS IS PUBLIC
        public int bUseAsynLogin;
        public byte[] byRes2 = new byte[128];

        public NET_DVR_USER_LOGIN_INFO() {
            super();
        }

        public NET_DVR_USER_LOGIN_INFO(Pointer peer) {
            super(peer);
            read();
        }

        @Override
        protected List<String> getFieldOrder() {
            // This order MUST match the order in the C SDK's struct definition
            return Arrays.asList(
                    "sDeviceAddress",
                    "byUseTransport",
                    "wPort",
                    "sUserName",
                    "sPassword",
                    "cbLoginResult",
                    "pUser",
                    "bUseAsynLogin",
                    "byRes2"
            );
        }

        public static class ByReference extends NET_DVR_USER_LOGIN_INFO implements Structure.ByReference {}
        public static class ByValue extends NET_DVR_USER_LOGIN_INFO implements Structure.ByValue {}
    }
    public static class NET_DVR_DEVICEINFO_V40 extends Structure {
        public NET_DVR_DEVICEINFO_V30 struDeviceV30 = new NET_DVR_DEVICEINFO_V30();
        public byte bySupportLock;
        public byte byRetryLoginTime;
        public byte byPasswordLevel;
        public byte byRes1;
        public int dwSurplusLockTime;
        public byte[] byRes2 = new byte[256];

        @Override
        protected List<String> getFieldOrder() {
            return Arrays.asList(
                    "struDeviceV30",
                    "bySupportLock",
                    "byRetryLoginTime",
                    "byPasswordLevel",
                    "byRes1",
                    "dwSurplusLockTime",
                    "byRes2"
            );
        }
    }

    public static enum _SDK_NET_ENV {
        LOCAL_AREA_NETWORK,
        WIDE_AREA_NETWORK;
    }

    public static enum ENUM_UPGRADE_TYPE {
        ENUM_UPGRADE_DVR,
        ENUM_UPGRADE_ADAPTER,
        ENUM_UPGRADE_VCALIB,
        ENUM_UPGRADE_OPTICAL,
        ENUM_UPGRADE_ACS,
        ENUM_UPGRADE_AUXILIARY_DEV,
        ENUM_UPGRADE_LED;
    }

    public static enum DISPLAY_MODE {
        NORMALMODE,
        OVERLAYMODE;
    }

    public static enum SEND_MODE {
        PTOPTCPMODE,
        PTOPUDPMODE,
        MULTIMODE,
        RTPMODE,
        RESERVEDMODE;
    }

    public static enum CAPTURE_MODE {
        BMP_MODE,
        JPEG_MODE;
    }

    public static enum REALSOUND_MODE {
        NONE,
        MONOPOLIZE_MODE,
        SHARE_MODE;
    }

    public static class NET_DVR_CLIENTINFO extends Structure {
        public NativeLong lChannel;
        public NativeLong lLinkMode;
        public User32.HWND hPlayWnd;
        public String sMultiCastIP;
    }

    public static class NET_DVR_PREVIEWINFO extends Structure {
        public NativeLong lChannel;
        public int dwStreamType;
        public int dwLinkMode;
        public User32.HWND hPlayWnd;
        public boolean bBlocked;
        public boolean bPassbackRecord;
        public byte byPreviewMode;
        public byte[] byStreamID = new byte[32];
        public byte byProtoType;
        public byte[] byRes1 = new byte[2];
        public int dwDisplayBufNum;
        public byte[] byRes = new byte[216];
    }

    public static class NET_DVR_SDKSTATE extends Structure {
        public int dwTotalLoginNum;
        public int dwTotalRealPlayNum;
        public int dwTotalPlayBackNum;
        public int dwTotalAlarmChanNum;
        public int dwTotalFormatNum;
        public int dwTotalFileSearchNum;
        public int dwTotalLogSearchNum;
        public int dwTotalSerialNum;
        public int dwTotalUpgradeNum;
        public int dwTotalVoiceComNum;
        public int dwTotalBroadCastNum;
        public int[] dwRes = new int[10];
    }

    public static class NET_DVR_SDKABL extends Structure {
        public int dwMaxLoginNum;
        public int dwMaxRealPlayNum;
        public int dwMaxPlayBackNum;
        public int dwMaxAlarmChanNum;
        public int dwMaxFormatNum;
        public int dwMaxFileSearchNum;
        public int dwMaxLogSearchNum;
        public int dwMaxSerialNum;
        public int dwMaxUpgradeNum;
        public int dwMaxVoiceComNum;
        public int dwMaxBroadCastNum;
        public int[] dwRes = new int[10];
    }

    public static class NET_DVR_ALARMER extends Structure {
        public byte byUserIDValid;
        public byte bySerialValid;
        public byte byVersionValid;
        public byte byDeviceNameValid;
        public byte byMacAddrValid;
        public byte byLinkPortValid;
        public byte byDeviceIPValid;
        public byte bySocketIPValid;
        public NativeLong lUserID;
        public byte[] sSerialNumber = new byte[48];
        public int dwDeviceVersion;
        public byte[] sDeviceName = new byte[32];
        public byte[] byMacAddr = new byte[6];
        public short wLinkPort;
        public byte[] sDeviceIP = new byte[128];
        public byte[] sSocketIP = new byte[128];
        public byte byIpProtocol;
        public byte[] byRes2 = new byte[11];
    }

    public static class NET_DVR_DISPLAY_PARA extends Structure {
        public NativeLong bToScreen;
        public NativeLong bToVideoOut;
        public NativeLong nLeft;
        public NativeLong nTop;
        public NativeLong nWidth;
        public NativeLong nHeight;
        public NativeLong nReserved;
    }

    public static class NET_DVR_CARDINFO extends Structure {
        public NativeLong lChannel;
        public NativeLong lLinkMode;
        public String sMultiCastIP;
        public NET_DVR_DISPLAY_PARA struDisplayPara = new NET_DVR_DISPLAY_PARA();
    }

    public static class NET_DVR_FIND_DATA extends Structure {
        public byte[] sFileName = new byte[100];
        public NET_DVR_TIME struStartTime = new NET_DVR_TIME();
        public NET_DVR_TIME struStopTime = new NET_DVR_TIME();
        public int dwFileSize;
    }

    public static class NET_DVR_FINDDATA_V30 extends Structure {
        public byte[] sFileName = new byte[100];
        public NET_DVR_TIME struStartTime = new NET_DVR_TIME();
        public NET_DVR_TIME struStopTime = new NET_DVR_TIME();
        public int dwFileSize;
        public byte[] sCardNum = new byte[32];
        public byte byLocked;
        public byte[] byRes = new byte[3];
    }

    public static class NET_DVR_FINDDATA_CARD extends Structure {
        public byte[] sFileName = new byte[100];
        public NET_DVR_TIME struStartTime = new NET_DVR_TIME();
        public NET_DVR_TIME struStopTime = new NET_DVR_TIME();
        public int dwFileSize;
        public byte[] sCardNum = new byte[32];
    }

    public static class NET_DVR_STREAM_INFO extends Structure {
        public int dwSize;
        public byte[] byID = new byte[32];
        public int dwChannel;
        public byte[] byRes = new byte[32];
    }

    public static class NET_DVR_VOD_PARA extends Structure {
        public int dwSize;
        public NET_DVR_STREAM_INFO struIDInfo = new NET_DVR_STREAM_INFO();
        public NET_DVR_TIME struBeginTime = new NET_DVR_TIME();
        public NET_DVR_TIME struEndTime = new NET_DVR_TIME();
        public User32.HWND hWnd;
        public byte byDrawFrame;
        public byte byVolumeType;
        public byte byVolumeNum;
        public byte byStreamType;
        public int dwFileIndex;
        public byte byAudioFile;
        public byte[] byRes2 = new byte[23];
    }

    public static class NET_DVR_FILECOND extends Structure {
        public NativeLong lChannel;
        public int dwFileType;
        public int dwIsLocked;
        public int dwUseCardNo;
        public byte[] sCardNumber = new byte[32];
        public NET_DVR_TIME struStartTime = new NET_DVR_TIME();
        public NET_DVR_TIME struStopTime = new NET_DVR_TIME();
    }

    public static class NET_DVR_FILECOND_V40 extends Structure {
        public NativeLong lChannel;
        public int dwFileType;
        public int dwIsLocked;
        public int dwUseCardNo;
        public byte[] sCardNumber = new byte[32];
        public NET_DVR_TIME struStartTime = new NET_DVR_TIME();
        public NET_DVR_TIME struStopTime = new NET_DVR_TIME();
        public byte byDrawFrame;
        public byte byFindType;
        public byte byQuickSearch;
        public byte bySpecialFindInfoType;
        public int dwVolumeNum;
        public byte[] byWorkingDeviceGUID = new byte[16];
        public NET_DVR_SPECIAL_FINDINFO_UNION uSpecialFindInfo = new NET_DVR_SPECIAL_FINDINFO_UNION();
        public byte byStreamType;
        public byte byAudioFile;
        public byte[] byRes2 = new byte[30];
    }

    public static class NET_DVR_SPECIAL_FINDINFO_UNION extends Structure {
        public byte[] byLength = new byte[8];
        public NET_DVR_ATMEINDINFO struATMFindInfo = new NET_DVR_ATMEINDINFO();
    }

    public static class NET_DVR_ATMEINDINFO extends Structure {
        public byte byTransactionType;
        public byte[] byRes = new byte[3];
        public int dwTransationAmount;
    }

    public static class NET_DVR_FINDDATA_V40 extends Structure {
        public byte[] sFileName = new byte[100];
        public NET_DVR_TIME struStartTime = new NET_DVR_TIME();
        public NET_DVR_TIME struStopTime = new NET_DVR_TIME();
        public int dwFileSize;
        public byte[] sCardNum = new byte[32];
        public byte byLocked;
        public byte[] byRes1 = new byte[127];
        public byte byFileType;
        public byte byQuickSearch;
        public byte byRes;
        public int dwFileIndex;
        public byte byStreamType;
    }

    public static class NET_DVR_PLAYCOND extends Structure {
        public int dwChannel;
        public NET_DVR_TIME struStartTime = new NET_DVR_TIME();
        public NET_DVR_TIME struStopTime = new NET_DVR_TIME();
        public byte byDrawFrame;
        public byte byStreamType;
        public byte[] byStreamID = new byte[32];
        public byte[] byRes = new byte[30];
    }

    public static class NET_DVR_POINT_FRAME extends Structure {
        public int xTop;
        public int yTop;
        public int xBottom;
        public int yBottom;
        public int bCounter;
    }

    public static class NET_DVR_COMPRESSION_AUDIO extends Structure {
        public byte byAudioEncType;
        public byte[] byres = new byte[7];
    }

    public static class RECV_ALARM extends Structure {
        public byte[] RecvBuffer = new byte[400];
    }

    public static class NET_DVR_PTZ_PATTERN extends Structure {
        public int dwSize;
        public int dwChannel;
        public int dwPatternCmd;
        public int dwPatternID;
        public byte[] byRes = new byte[64];
    }

    public static class NET_DVR_FUZZY_UPGRADE extends Structure {
        public int dwSize;
        public byte[] sUpgradeInfo = new byte[48];
        public byte[] byRes = new byte[64];
    }

    public static class NET_DVR_SERIALSTART_V40 extends Structure {
        public int dwSize;
        public int dwSerialType;
        public byte bySerialNum;
        public byte[] byRes = new byte[255];
    }

    public static class NET_DVR_AUXILIARY_DEV_UPGRADE_PARAM extends Structure {
        public int dwSize;
        public int dwDevNo;
        public byte byDevType;
        public byte[] byRes = new byte[131];
    }

    public static class struStatFrame extends Structure {
        public int dwRelativeTime;
        public int dwAbsTime;
        public byte[] byRes = new byte[92];
    }

    public static class struStartTime extends Structure {
        public NET_DVR_TIME tmStart = new NET_DVR_TIME();
        public NET_DVR_TIME tmEnd = new NET_DVR_TIME();
        public byte[] byRes = new byte[92];
    }

    public static class uStatModeParam extends Union {
        public struStatFrame strustatFrame = new struStatFrame();
        public struStartTime strustartTime = new struStartTime();
    }

    public static class NET_VCA_DEV_INFO extends Structure {
        public NET_DVR_IPADDR struDevIP = new NET_DVR_IPADDR();
        public short wPort;
        public byte byChannel;
        public byte byIvmsChannel;
    }

    public static class NET_DVR_PDC_ALRAM_INFO extends Structure {
        public int dwSize;
        public byte byMode;
        public byte byChannel;
        public byte bySmart;
        public byte byRes1;
        public NET_VCA_DEV_INFO struDevInfo = new NET_VCA_DEV_INFO();
        public uStatModeParam ustateModeParam = new uStatModeParam();
        public int dwLeaveNum;
        public int dwEnterNum;
        public byte[] byRes2 = new byte[40];
    }

    public static class NET_DVR_PLATE_INFO extends Structure {
        public byte byPlateType;
        public byte byColor;
        public byte byBright;
        public byte byLicenseLen;
        public byte byEntireBelieve;
        public byte byRegion;
        public byte byCountry;
        public byte[] byRes = new byte[33];
        public NET_VCA_RECT struPlateRect = new NET_VCA_RECT();
        public String sLicense;
        public byte[] byBelieve = new byte[16];
    }

    public static class NET_DVR_VEHICLE_INFO extends Structure {
        public int dwIndex;
        public byte byVehicleType;
        public byte byColorDepth;
        public byte byColor;
        public byte byRes1;
        public short wSpeed;
        public short wLength;
        public byte byIllegalType;
        public byte byVehicleLogoRecog;
        public byte byVehicleSubLogoRecog;
        public byte byVehicleModel;
        public byte[] byCustomInfo = new byte[16];
        public short wVehicleLogoRecog;
        public byte[] byRes3 = new byte[14];
    }

    public static class NET_DVR_PLATE_RESULT extends Structure {
        public int dwSize;
        public byte byResultType;
        public byte byChanIndex;
        public short wAlarmRecordID;
        public int dwRelativeTime;
        public byte[] byAbsTime = new byte[32];
        public int dwPicLen;
        public int dwPicPlateLen;
        public int dwVideoLen;
        public byte byTrafficLight;
        public byte byPicNum;
        public byte byDriveChan;
        public byte byVehicleType;
        public int dwBinPicLen;
        public int dwCarPicLen;
        public int dwFarCarPicLen;
        public ByteByReference pBuffer3;
        public ByteByReference pBuffer4;
        public ByteByReference pBuffer5;
        public byte byRelaLaneDirectionType;
        public byte[] byRes3 = new byte[7];
        public NET_DVR_PLATE_INFO struPlateInfo = new NET_DVR_PLATE_INFO();
        public NET_DVR_VEHICLE_INFO struVehicleInfo = new NET_DVR_VEHICLE_INFO();
        public ByteByReference pBuffer1;
        public ByteByReference pBuffer2;
    }

    public static class NET_ITC_PLATE_RECOG_PARAM extends Structure {
        public byte[] byDefaultCHN = new byte[3];
        public byte byEnable;
        public int dwRecogMode;
        public byte byVehicleLogoRecog;
        public byte byProvince;
        public byte byRegion;
        public byte byRes1;
        public short wPlatePixelWidthMin;
        public short wPlatePixelWidthMax;
        public byte[] byRes = new byte[24];
    }

    public static class NET_VCA_RECT extends Structure {
        public float fX;
        public float fY;
        public float fWidth;
        public float fHeight;
    }

    public static class NET_VCA_POINT extends Structure {
        public float fX;
        public float fY;
    }

    public static class NET_ITC_POLYGON extends Structure {
        public int dwPointNum;
        public NET_VCA_POINT[] struPos = new NET_VCA_POINT[20];

        public NET_ITC_POLYGON() {
            for(int i = 0; i < 20; ++i) {
                this.struPos[i] = new NET_VCA_POINT();
            }

        }
    }

    public static class B extends Structure {
        public int b1;
        public int b2;
        public int b3;
    }

    public static class A extends Union {
        public int[] arr = new int[2];
        public B b;

        public A() {
            this.arr[0] = 1;
            this.arr[1] = 1;
        }
    }

    public static class uRegion extends Union {
        public NET_VCA_RECT struRect = new NET_VCA_RECT();
        public NET_ITC_POLYGON struPolygon = new NET_ITC_POLYGON();
    }

    public static class NET_ITC_PLATE_RECOG_REGION_PARAM extends Structure {
        public byte byMode;
        public byte[] byRes1 = new byte[3];
        public uRegion uregion = new uRegion();
        public byte[] byRes = new byte[16];
    }

    public static class NET_ITC_SINGLE_IOSPEED_PARAM extends Structure {
        public byte byEnable;
        public byte byTrigCoil1;
        public byte byCoil1IOStatus;
        public byte byTrigCoil2;
        public byte byCoil2IOStatus;
        public byte byRelatedDriveWay;
        public byte byTimeOut;
        public byte byRelatedIOOutEx;
        public int dwDistance;
        public byte byCapSpeed;
        public byte bySpeedLimit;
        public byte bySpeedCapEn;
        public byte bySnapTimes1;
        public byte bySnapTimes2;
        public byte byBigCarSpeedLimit;
        public byte byBigCarSignSpeed;
        public byte byIntervalType;
        public short[] wInterval1 = new short[4];
        public short[] wInterval2 = new short[4];
        public byte[] byRelatedIOOut = new byte[4];
        public byte byFlashMode;
        public byte byLaneType;
        public byte byCarSignSpeed;
        public byte byUseageType;
        public NET_ITC_PLATE_RECOG_REGION_PARAM[] struPlateRecog = new NET_ITC_PLATE_RECOG_REGION_PARAM[2];
        public byte byRelaLaneDirectionType;
        public byte byLowSpeedLimit;
        public byte byBigCarLowSpeedLimit;
        public byte byLowSpeedCapEn;
        public byte[] byRes = new byte[28];

        public NET_ITC_SINGLE_IOSPEED_PARAM() {
            for(int i = 0; i < 2; ++i) {
                this.struPlateRecog[i] = new NET_ITC_PLATE_RECOG_REGION_PARAM();
            }

        }
    }

    public static class NET_ITC_POST_IOSPEED_PARAM extends Structure {
        public NET_ITC_PLATE_RECOG_PARAM struPlateRecog = new NET_ITC_PLATE_RECOG_PARAM();
        public NET_ITC_SINGLE_IOSPEED_PARAM[] struSingleIOSpeed = new NET_ITC_SINGLE_IOSPEED_PARAM[4];
        public byte[] byRes = new byte[32];

        public NET_ITC_POST_IOSPEED_PARAM() {
            for(int i = 0; i < 4; ++i) {
                this.struSingleIOSpeed[i] = new NET_ITC_SINGLE_IOSPEED_PARAM();
            }

        }
    }

    public static class NET_ITC_TRIGGER_PARAM_UNION extends Union {
        public NET_ITC_POST_IOSPEED_PARAM struIOSpeed = new NET_ITC_POST_IOSPEED_PARAM();
        public int[] uLen = new int[1070];
    }

    public static class NET_ITC_SINGLE_TRIGGERCFG extends Structure {
        public byte byEnable;
        public byte[] byRes1 = new byte[3];
        public int dwTriggerType;
        public NET_ITC_TRIGGER_PARAM_UNION uTriggerParam = new NET_ITC_TRIGGER_PARAM_UNION();
        public byte[] byRes = new byte[64];
    }

    public static class NET_ITC_TRIGGERCFG extends Structure {
        public int dwSize;
        public NET_ITC_SINGLE_TRIGGERCFG struTriggerParam = new NET_ITC_SINGLE_TRIGGERCFG();
        public byte[] byRes = new byte[32];
    }

    public static class NET_DVR_AUDIO_INPUT_PARAM extends Structure {
        public byte byAudioInputType;
        public byte byVolume;
        public byte byEnableNoiseFilter;
        public byte[] byres = new byte[5];
    }

    public static class NET_DVR_MULTI_STREAM_COMPRESSIONCFG_COND extends Structure {
        public int dwSize;
        public NET_DVR_STREAM_INFO struStreamInfo = new NET_DVR_STREAM_INFO();
        public int dwStreamType;
        public byte[] byRes = new byte[32];
    }

    public static class NET_DVR_MULTI_STREAM_COMPRESSIONCFG extends Structure {
        public int dwSize;
        public int dwStreamType;
        public NET_DVR_COMPRESSION_INFO_V30 struStreamPara = new NET_DVR_COMPRESSION_INFO_V30();
        public byte[] byRes = new byte[80];
    }

    public static class NET_DVR_DAYTIME extends Structure {
        public byte byHour;
        public byte byMinute;
        public byte bySecond;
        public byte byRes;
        public short wMilliSecond;
        public byte[] byRes1 = new byte[2];
    }

    public static class NET_DVR_SCHEDULE_DAYTIME extends Structure {
        public NET_DVR_DAYTIME struStartTime = new NET_DVR_DAYTIME();
        public NET_DVR_DAYTIME struStopTime = new NET_DVR_DAYTIME();
    }

    public static class NET_DVR_VIDEOEFFECT extends Structure {
        public byte byBrightnessLevel;
        public byte byContrastLevel;
        public byte bySharpnessLevel;
        public byte bySaturationLevel;
        public byte byHueLevel;
        public byte byEnableFunc;
        public byte byLightInhibitLevel;
        public byte byGrayLevel;
    }

    public static class NET_DVR_GAIN extends Structure {
        public byte byGainLevel;
        public byte byGainUserSet;
        public byte[] byRes = new byte[2];
        public int dwMaxGainValue;
    }

    public static class NET_DVR_WHITEBALANCE extends Structure {
        public byte byWhiteBalanceMode;
        public byte byWhiteBalanceModeRGain;
        public byte byWhiteBalanceModeBGain;
        public byte[] byRes = new byte[5];
    }

    public static class NET_DVR_EXPOSURE extends Structure {
        public byte byExposureMode;
        public byte byAutoApertureLevel;
        public byte[] byRes = new byte[2];
        public int dwVideoExposureSet;
        public int dwExposureUserSet;
        public int dwRes;
    }

    public static class NET_DVR_GAMMACORRECT extends Structure {
        public byte byGammaCorrectionEnabled;
        public byte byGammaCorrectionLevel;
        public byte[] byRes = new byte[6];
    }

    public static class NET_DVR_WDR extends Structure {
        public byte byWDREnabled;
        public byte byWDRLevel1;
        public byte byWDRLevel2;
        public byte byWDRContrastLevel;
        public byte[] byRes = new byte[16];
    }

    public static class NET_DVR_DAYNIGHT extends Structure {
        public byte byDayNightFilterType;
        public byte bySwitchScheduleEnabled;
        public byte byBeginTime;
        public byte byEndTime;
        public byte byDayToNightFilterLevel;
        public byte byNightToDayFilterLevel;
        public byte byDayNightFilterTime;
        public byte byBeginTimeMin;
        public byte byBeginTimeSec;
        public byte byEndTimeMin;
        public byte byEndTimeSec;
        public byte byAlarmTrigState;
    }

    public static class NET_DVR_BACKLIGHT extends Structure {
        public byte byBacklightMode;
        public byte byBacklightLevel;
        public byte[] byRes1 = new byte[2];
        public int dwPositionX1;
        public int dwPositionY1;
        public int dwPositionX2;
        public int dwPositionY2;
        public byte[] byRes2 = new byte[4];
    }

    public static class NET_DVR_NOISEREMOVE extends Structure {
        public byte byDigitalNoiseRemoveEnable;
        public byte byDigitalNoiseRemoveLevel;
        public byte bySpectralLevel;
        public byte byTemporalLevel;
        public byte byDigitalNoiseRemove2DEnable;
        public byte byDigitalNoiseRemove2DLevel;
        public byte[] byRes = new byte[2];
    }

    public static class NET_DVR_CMOSMODECFG extends Structure {
        public byte byCaptureMod;
        public byte byBrightnessGate;
        public byte byCaptureGain1;
        public byte byCaptureGain2;
        public int dwCaptureShutterSpeed1;
        public int dwCaptureShutterSpeed2;
        public byte[] byRes = new byte[4];
    }

    public static class NET_DVR_DEFOGCFG extends Structure {
        public byte byMode;
        public byte byLevel;
        public byte[] byRes = new byte[6];
    }

    public static class NET_DVR_ELECTRONICSTABILIZATION extends Structure {
        public byte byEnable;
        public byte byLevel;
        public byte[] byRes = new byte[6];
    }

    public static class NET_DVR_CORRIDOR_MODE_CCD extends Structure {
        public byte byEnableCorridorMode;
        public byte[] byRes = new byte[11];
    }

    public static class NET_DVR_SMARTIR_PARAM extends Structure {
        public byte byMode;
        public byte byIRDistance;
        public byte byShortIRDistance;
        public byte byLongIRDistance;
    }

    public static class NET_DVR_PIRIS_PARAM extends Structure {
        public byte byMode;
        public byte byPIrisAperture;
        public byte[] byRes = new byte[6];
    }

    public static class NET_DVR_LASER_PARAM_CFG extends Structure {
        public byte byControlMode;
        public byte bySensitivity;
        public byte byTriggerMode;
        public byte byBrightness;
        public byte byAngle;
        public byte byLimitBrightness;
        public byte[] byRes = new byte[10];
    }

    public static class NET_DVR_FFC_PARAM extends Structure {
        public byte byMode;
        public byte byRes1;
        public short wCompensateTime;
        public byte[] byRes2 = new byte[4];
    }

    public static class NET_DVR_DDE_PARAM extends Structure {
        public byte byMode;
        public byte byNormalLevel;
        public byte byExpertLevel;
        public byte[] byRes = new byte[5];
    }

    public static class NET_DVR_AGC_PARAM extends Structure {
        public byte bySceneType;
        public byte byLightLevel;
        public byte byGainLevel;
        public byte[] byRes = new byte[5];
    }

    public static class NET_DVR_SNAP_CAMERAPARAMCFG extends Structure {
        public byte byWDRMode;
        public byte byWDRType;
        public byte byWDRLevel;
        public byte byRes1;
        public NET_DVR_TIME_EX struStartTime = new NET_DVR_TIME_EX();
        public NET_DVR_TIME_EX struEndTime = new NET_DVR_TIME_EX();
        public byte byDayNightBrightness;
        public byte[] byRes = new byte[43];
    }

    public static class NET_DVR_CAMERAPARAMCFG_EX extends Structure {
        public int dwSize;
        public NET_DVR_VIDEOEFFECT struVideoEffect = new NET_DVR_VIDEOEFFECT();
        public NET_DVR_GAIN struGain = new NET_DVR_GAIN();
        public NET_DVR_WHITEBALANCE struWhiteBalance = new NET_DVR_WHITEBALANCE();
        public NET_DVR_EXPOSURE struExposure = new NET_DVR_EXPOSURE();
        public NET_DVR_GAMMACORRECT struGammaCorrect = new NET_DVR_GAMMACORRECT();
        public NET_DVR_WDR struWdr = new NET_DVR_WDR();
        public NET_DVR_DAYNIGHT struDayNight = new NET_DVR_DAYNIGHT();
        public NET_DVR_BACKLIGHT struBackLight = new NET_DVR_BACKLIGHT();
        public NET_DVR_NOISEREMOVE struNoiseRemove = new NET_DVR_NOISEREMOVE();
        public byte byPowerLineFrequencyMode;
        public byte byIrisMode;
        public byte byMirror;
        public byte byDigitalZoom;
        public byte byDeadPixelDetect;
        public byte byBlackPwl;
        public byte byEptzGate;
        public byte byLocalOutputGate;
        public byte byCoderOutputMode;
        public byte byLineCoding;
        public byte byDimmerMode;
        public byte byPaletteMode;
        public byte byEnhancedMode;
        public byte byDynamicContrastEN;
        public byte byDynamicContrast;
        public byte byJPEGQuality;
        public NET_DVR_CMOSMODECFG struCmosModeCfg = new NET_DVR_CMOSMODECFG();
        public byte byFilterSwitch;
        public byte byFocusSpeed;
        public byte byAutoCompensationInterval;
        public byte bySceneMode;
        public NET_DVR_DEFOGCFG struDefogCfg = new NET_DVR_DEFOGCFG();
        public NET_DVR_ELECTRONICSTABILIZATION struElectronicStabilization = new NET_DVR_ELECTRONICSTABILIZATION();
        public NET_DVR_CORRIDOR_MODE_CCD struCorridorMode = new NET_DVR_CORRIDOR_MODE_CCD();
        public byte byExposureSegmentEnable;
        public byte byBrightCompensate;
        public byte byCaptureModeN;
        public byte byCaptureModeP;
        public NET_DVR_SMARTIR_PARAM struSmartIRParam = new NET_DVR_SMARTIR_PARAM();
        public NET_DVR_PIRIS_PARAM struPIrisParam = new NET_DVR_PIRIS_PARAM();
        public NET_DVR_LASER_PARAM_CFG struLaserParam = new NET_DVR_LASER_PARAM_CFG();
        public NET_DVR_FFC_PARAM struFFCParam = new NET_DVR_FFC_PARAM();
        public NET_DVR_DDE_PARAM struDDEParam = new NET_DVR_DDE_PARAM();
        public NET_DVR_AGC_PARAM struAGCParam = new NET_DVR_AGC_PARAM();
        public byte byLensDistortionCorrection;
        public byte[] byRes1 = new byte[3];
        public NET_DVR_SNAP_CAMERAPARAMCFG struSnapCCD = new NET_DVR_SNAP_CAMERAPARAMCFG();
        public byte[] byRes2 = new byte[188];
    }

    public static class NET_DVR_ISP_CAMERAPARAMCFG extends Structure {
        public int dwSize;
        public byte byWorkType;
        public byte[] byRes = new byte[3];
        public NET_DVR_SCHEDULE_DAYTIME struDayNightScheduleTime = new NET_DVR_SCHEDULE_DAYTIME();
        public NET_DVR_CAMERAPARAMCFG_EX struSelfAdaptiveParam = new NET_DVR_CAMERAPARAMCFG_EX();
        public NET_DVR_CAMERAPARAMCFG_EX struDayIspAdvanceParam = new NET_DVR_CAMERAPARAMCFG_EX();
        public NET_DVR_CAMERAPARAMCFG_EX struNightIspAdvanceParam = new NET_DVR_CAMERAPARAMCFG_EX();
        public byte[] byRes1 = new byte[512];
    }

    public static class NET_DVR_LOCAL_SDK_PATH extends Structure {
        public byte[] sPath = new byte[256];
        public byte[] byRes = new byte[128];
    }

    public static class BYTE_ARRAY extends Structure {
        public byte[] byValue;

        public BYTE_ARRAY(int iLen) {
            this.byValue = new byte[iLen];
        }

        protected List<String> getFieldOrder() {
            return Arrays.asList("byValue");
        }
    }

    public static class NET_DVR_XML_CONFIG_INPUT extends Structure {
        public int dwSize;
        public Pointer lpRequestUrl;
        public int dwRequestUrlLen;
        public Pointer lpInBuffer;
        public int dwInBufferSize;
        public int dwRecvTimeOut;
        public byte[] byRes = new byte[32];
    }

    public static class NET_DVR_STRING_POINTER extends Structure {
        public byte[] byString = new byte[3145728];
    }

    public static class NET_DVR_XML_CONFIG_OUTPUT extends Structure {
        public int dwSize;
        public Pointer lpOutBuffer;
        public int dwOutBufferSize;
        public int dwReturnedXMLSize;
        public Pointer lpStatusBuffer;
        public int dwStatusSize;
        public byte[] byRes = new byte[32];
    }

    public static class NET_DVR_DATE extends Structure {
        public short wYear;
        public byte byMonth;
        public byte byDay;
    }

    public static class NET_DVR_ID_CARD_INFO extends Structure {
        public int dwSize;
        public byte[] byName = new byte[128];
        public NET_DVR_DATE struBirth;
        public byte[] byAddr = new byte[280];
        public byte[] byIDNum = new byte[32];
        public byte[] byIssuingAuthority = new byte[128];
        public NET_DVR_DATE struStartDate;
        public NET_DVR_DATE struEndDate;
        public byte byTermOfValidity;
        public byte bySex;
        public byte byNation;
        public byte[] byRes = new byte[101];
    }

    public static class NET_DVR_ID_CARD_INFO_ALARM extends Structure {
        public int dwSize;
        public NET_DVR_ID_CARD_INFO struIDCardCfg;
        public int dwMajor;
        public int dwMinor;
        public NET_DVR_TIME_V30 struSwipeTime;
        public byte[] byNetUser = new byte[16];
        public NET_DVR_IPADDR struRemoteHostAddr;
        public int dwCardReaderNo;
        public int dwDoorNo;
        public int dwPicDataLen;
        public Pointer pPicData;
        public byte byCardType;
        public byte byDeviceNo;
        public byte[] byRes2 = new byte[2];
        public int dwFingerPrintDataLen;
        public Pointer pFingerPrintData;
        public int dwCapturePicDataLen;
        public Pointer pCapturePicData;
        public byte[] byRes = new byte[188];
    }

    public static class NET_DVR_TIME_V29 extends Structure {
        public short wYear;
        public byte byMonth;
        public byte byDay;
        public byte byHour;
        public byte byMinute;
        public byte bySecond;
        public byte byRes;
        public short wMilliSec;
        public byte[] byRes0 = new byte[2];
    }

    public static class NET_VCA_FACESNAP_RESULT extends Structure {
        public int dwSize;
        public int dwRelativeTime;
        public int dwAbsTime;
        public int dwFacePicID;
        public int dwFaceScore;
        public NET_VCA_TARGET_INFO struTargetInfo;
        public NET_VCA_RECT struRect;
        public NET_VCA_DEV_INFO struDevInfo;
        public int dwFacePicLen;
        public int dwBackgroundPicLen;
        public byte bySmart;
        public byte byAlarmEndMark;
        public byte byRepeatTimes;
        public byte byUploadEventDataType;
        public NET_VCA_HUMAN_FEATURE struFeature;
        public float fStayDuration;
        public byte[] sStorageIP = new byte[16];
        public short wStoragePort;
        public short wDevInfoIvmsChannelEx;
        public byte[] byRes1 = new byte[16];
        public byte byBrokenNetHttp;
        public Pointer pBuffer1;
        public Pointer pBuffer2;
    }

    public static class NET_VCA_FACESNAP_INFO_ALARM extends Structure {
        public int dwRelativeTime;
        public int dwAbsTime;
        public int dwSnapFacePicID;
        public int dwSnapFacePicLen;
        public NET_VCA_DEV_INFO struDevInfo;
        public byte byFaceScore;
        public byte bySex;
        public byte byGlasses;
        public byte byAge;
        public byte byAgeDeviation;
        public byte[] byRes1 = new byte[3];
        public int dwUIDLen;
        public Pointer pUIDBuffer;
        public byte[] byRes = new byte[4];
        public Pointer pBuffer1;
    }

    public static class NET_VCA_TARGET_INFO extends Structure {
        public int dwID;
        public NET_VCA_RECT struRect;
        public byte[] byRes = new byte[4];
    }

    public static class NET_VCA_HUMAN_FEATURE extends Structure {
        public byte byAgeGroup;
        public byte bySex;
        public byte byEyeGlass;
        public byte byAge;
        public byte byAgeDeviation;
        public byte[] byRes = new byte[13];
    }

    public static class NET_DVR_TIME_V30 extends Structure {
        public short wYear;
        public byte byMonth;
        public byte byDay;
        public byte byHour;
        public byte byMinute;
        public byte bySecond;
        public byte byRes;
        public short wMilliSec;
        public byte[] byRes1 = new byte[2];
    }

    public static class NET_DVR_UPGRADE_PARAM extends Structure {
        public int dwUpgradeType;
        public String sFilename;
        public Pointer pInbuffer;
        public int dwBufferLen;
        public byte[] pUnitIdList = new byte[64];
        public byte[] byRes = new byte[112];
    }

    public interface FColGlobalDataCallBack extends Callback {
        void invoke(NativeLong var1, String var2, NativeLong var3, String var4, int var5, int var6);
    }

    public interface FColLocalDataCallBack extends Callback {
        void invoke(NativeLong var1, String var2, NativeLong var3, String var4, int var5, int var6);
    }

    public interface FDrawFun extends Callback {
        void invoke(NativeLong var1, User32.HDC var2, int var3);
    }

    public interface FExceptionCallBack extends Callback {
        void invoke(int var1, NativeLong var2, NativeLong var3, Pointer var4) throws InterruptedException;
    }

    public interface FJpegdataCallBack extends Callback {
        int invoke(NativeLong var1, NativeLong var2, String var3, String var4, String var5, int var6, int var7);
    }

    public interface FLoginResultCallBack extends Callback {
        int invoke(NativeLong var1, int var2, Pointer var3, Pointer var4);
    }

    public interface FMSGCallBack extends Callback {
        void invoke(NativeLong var1, NET_DVR_ALARMER var2, RECV_ALARM var3, int var4, Pointer var5);
    }

    public interface FMessCallBack extends Callback {
        boolean invoke(NativeLong var1, String var2, String var3, int var4);
    }

    public interface FMessCallBack_EX extends Callback {
        boolean invoke(NativeLong var1, NativeLong var2, String var3, int var4);
    }

    public interface FMessCallBack_NEW extends Callback {
        boolean invoke(NativeLong var1, String var2, String var3, int var4, short var5);
    }

    public interface FMessageCallBack extends Callback {
        boolean invoke(NativeLong var1, String var2, String var3, int var4, int var5);
    }

    public interface FPlayDataCallBack extends Callback {
        void invoke(NativeLong var1, int var2, ByteByReference var3, int var4, int var5);
    }

    public interface FPostMessageCallBack extends Callback {
        int invoke(int var1, NativeLong var2);
    }

    public interface FRealDataCallBack_V30 extends Callback {
        void invoke(NativeLong var1, int var2, ByteByReference var3, int var4, Pointer var5);
    }

    public interface FRowDataCallBack extends Callback {
        void invoke(NativeLong var1, String var2, NativeLong var3, String var4, int var5, int var6);
    }

    public interface FSerialDataCallBack extends Callback {
        void invoke(NativeLong var1, String var2, int var3, int var4);
    }

    public interface FSerialDataCallBack_V40 extends Callback {
        void invoke(NativeLong var1, NativeLong var2, Pointer var3, int var4, Pointer var5);
    }

    public interface FStdDataCallBack extends Callback {
        void invoke(NativeLong var1, int var2, ByteByReference var3, int var4, int var5);
    }

    public interface FVoiceDataCallBack extends Callback {
        void invoke(NativeLong var1, String var2, int var3, byte var4, int var5);
    }

    public interface FVoiceDataCallBack2 extends Callback {
        void invoke(String var1, int var2, Pointer var3);
    }

    public interface FVoiceDataCallBack_MR extends Callback {
        void invoke(NativeLong var1, String var2, int var3, byte var4, int var5);
    }

    public interface FVoiceDataCallBack_MR_V30 extends Callback {
        void invoke(NativeLong var1, String var2, int var3, byte var4, String var5);
    }

    public interface FVoiceDataCallBack_V30 extends Callback {
        void invoke(NativeLong var1, String var2, int var3, byte var4, Pointer var5);
    }
}
