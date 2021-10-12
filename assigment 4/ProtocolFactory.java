package edu.najah.it.capp.asd.intf;

import edu.najah.it.capp.asd.intf.*;


public class ProtocolFactory {

    public static Protocol protocolfun(String connectionType){
        if(connectionType==null)
            return null;
        else if(connectionType.equalsIgnoreCase("Ssh"))
        {
            return new Ssh();
        }
        else if(connectionType.equalsIgnoreCase("TFTP")) {
            return new TFTP();
        }
        else if(connectionType.equalsIgnoreCase("Telnet")) {
            return new Telnet();
        }
        else if(connectionType.equalsIgnoreCase("Ftp")) {
            return  new Ftp();
        }
        else if(connectionType.equalsIgnoreCase("Scp")) {
            return new Scp();
        }

        return null;
    }
    /*
    public class factory {
        public static final int FTP=1;
        public static final int SSH=2;
        public static final int SCP=3;
        public static final int TELNET=4;

        public  static protocol (int protocol){
            switch (protocol){
                case FTP:
                    protocol ftp=connection.getInstance(connectionType.FTP);
                    return ftp;
                    break;
                case SSH:
                    protocol ssh=connection.getInstance(connectionType.SSH);
                    return ssh;
                break;
                case SCP:
                    protocol scp=connection.getInstance(connectionType.SCP);
                    return scp;
                break;
                case TELNET:
                    protocol telnet=connection.getInstance(connectionType.TELNET);
                    return telnet;
                break;



            }
        }


     */








