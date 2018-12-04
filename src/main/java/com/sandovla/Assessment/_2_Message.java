package com.sandovla.Assessment;

public abstract class _2_Message {
    public String recipient;
    //public final abstract void sendMessage();
    public abstract void sendMessage();

    public static void main(String ... arg){
        _2_Message m = new TextMessage();
        m.recipient = "1234567890";
        m.sendMessage();
    }

    static class TextMessage extends _2_Message {

        //public final void sendMessage() {
        public void sendMessage() {
            System.out.println("Text message to " + recipient);
        }
    }
}
