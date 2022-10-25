package bean;

import lombok.Data;

@Data
/*@ApiModel("事件推送配置实体类")*/
public class EventPushConfig {

    private String eventCode;

    private String cimCode;

    private String eventName;

    private String dataItem;

    private String data1Name;

    private String data2Name;

    private String data3Name;

    private String data4Name;

    private String data5Name;

    private String data6Name;

    private String data7Name;

    private String data8Name;

    private Short whetherPublish;

    }