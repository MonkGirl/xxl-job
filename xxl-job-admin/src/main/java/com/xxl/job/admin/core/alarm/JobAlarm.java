package com.xxl.job.admin.core.alarm;

import com.xxl.job.admin.core.model.XxlJobInfo;
import com.xxl.job.admin.core.model.XxlJobLog;

/**
 * @author xuxueli 2020-01-19
 */
public interface JobAlarm {

    /**
     * job alarm.
     *
     * @param info info
     * @param jobLog jobLog
     * @return boolean
     */
    boolean doAlarm(XxlJobInfo info, XxlJobLog jobLog);

}
