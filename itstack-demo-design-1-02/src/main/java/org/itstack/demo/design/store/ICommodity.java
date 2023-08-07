package org.itstack.demo.design.store;

import java.util.Map;

public interface ICommodity {

    /**
     *
     * @author dongchao
     * @date 2023/8/7 15:09
     * @param uId 用户ID
     * @param commodityId 奖品ID
     * @param bizId 业务ID
     * @param extMap 扩展字段
     */
    void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception;

}
