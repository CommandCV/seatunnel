/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.seatunnel.core.flink.command;

import org.apache.seatunnel.core.base.command.Command;
import org.apache.seatunnel.core.base.config.ConfigBuilder;
<<<<<<<< HEAD:seatunnel-core/seatunnel-core-flink/src/main/java/org/apache/seatunnel/core/flink/command/FlinkApiConfValidateCommand.java
import org.apache.seatunnel.core.base.exception.ConfigCheckException;
import org.apache.seatunnel.core.base.utils.FileUtils;
import org.apache.seatunnel.core.flink.args.FlinkCommandArgs;
import org.apache.seatunnel.core.flink.config.FlinkApiConfigChecker;
========
import org.apache.seatunnel.core.base.utils.FileUtils;
import org.apache.seatunnel.core.flink.args.FlinkCommandArgs;
import org.apache.seatunnel.flink.FlinkEnvironment;
>>>>>>>> dev:seatunnel-core/seatunnel-core-flink/src/main/java/org/apache/seatunnel/core/flink/command/FlinkConfValidateCommand.java

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.file.Path;

/**
 * Used to check the Flink conf is validated.
 */
public class FlinkApiConfValidateCommand implements Command<FlinkCommandArgs> {

    private static final Logger LOGGER = LoggerFactory.getLogger(FlinkApiConfValidateCommand.class);

    private final FlinkCommandArgs flinkCommandArgs;

    public FlinkApiConfValidateCommand(FlinkCommandArgs flinkCommandArgs) {
        this.flinkCommandArgs = flinkCommandArgs;
    }

    private final FlinkCommandArgs flinkCommandArgs;

    public FlinkConfValidateCommand(FlinkCommandArgs flinkCommandArgs) {
        this.flinkCommandArgs = flinkCommandArgs;
    }

    @Override
<<<<<<<< HEAD:seatunnel-core/seatunnel-core-flink/src/main/java/org/apache/seatunnel/core/flink/command/FlinkApiConfValidateCommand.java
    public void execute() throws ConfigCheckException {
========
    public void execute() {
>>>>>>>> dev:seatunnel-core/seatunnel-core-flink/src/main/java/org/apache/seatunnel/core/flink/command/FlinkConfValidateCommand.java
        Path configPath = FileUtils.getConfigPath(flinkCommandArgs);
        ConfigBuilder configBuilder = new ConfigBuilder(configPath);
        new FlinkApiConfigChecker().checkConfig(configBuilder.getConfig());
        LOGGER.info("config OK !");
    }
}
