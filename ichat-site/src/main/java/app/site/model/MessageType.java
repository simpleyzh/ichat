package app.site.model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * @author Steve Zou
 */
@XmlType()
@XmlEnum(String.class)
public enum MessageType implements Serializable {
    @XmlEnumValue("text")
    TEXT("text"),
    @XmlEnumValue("image")
    IMAGE("image"),
    @XmlEnumValue("voice")
    VOICE("voice"),
    @XmlEnumValue("video")
    VIDEO("video"),
    @XmlEnumValue("music")
    MUSIC("music"),
    @XmlEnumValue("news")
    NEWS("news"),
    @XmlEnumValue("location")
    LOCATION("location");

    public final String value;
    MessageType(String value) {
        this.value = value;
    }
}
