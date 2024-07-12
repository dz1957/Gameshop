package cn.cie.event;

/**
 * Created by hm on 2024/6/25.
 * 异步事件类型
 */
public enum EventType {

    SEND_VALIDATE_EMAIL(1),
    SEND_FIND_PWD_EMAIL(2);

    private int value;

    EventType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
