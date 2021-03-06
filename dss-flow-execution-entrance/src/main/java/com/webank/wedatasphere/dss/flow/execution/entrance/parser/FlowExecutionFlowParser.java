/*
 * Copyright 2019 WeBank
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.webank.wedatasphere.dss.flow.execution.entrance.parser;

import com.webank.wedatasphere.dss.appjoint.scheduler.parser.AbstractFlowParser;
import com.webank.wedatasphere.dss.appjoint.scheduler.parser.NodeParser;
import com.webank.wedatasphere.dss.common.entity.flow.DWSJSONFlow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by peacewong on 2019/11/5.
 */
@Component
public class FlowExecutionFlowParser extends AbstractFlowParser {

    @Autowired
    @Override
    public void setNodeParsers(NodeParser[] nodeParsers) {
       super.setNodeParsers(nodeParsers);
    }

    @Override
    public Boolean ifFlowCanParse(DWSJSONFlow flow) {
        return true;
    }


}
