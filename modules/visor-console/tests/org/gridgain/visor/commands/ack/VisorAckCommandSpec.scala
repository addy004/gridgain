/* 
 Copyright (C) GridGain Systems. All Rights Reserved.
 
 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0
 
 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */

/*
 * ___    _________________________ ________
 * __ |  / /____  _/__  ___/__  __ \___  __ \
 * __ | / /  __  /  _____ \ _  / / /__  /_/ /
 * __ |/ /  __/ /   ____/ / / /_/ / _  _, _/
 * _____/   /___/   /____/  \____/  /_/ |_|
 *
 */

package org.gridgain.visor.commands.ack

import org.gridgain.visor._
import VisorAckCommand._

/**
 * Unit test for 'ack' command.
 */
class VisorAckCommandSpec extends VisorRuntimeBaseSpec(2) {
    behavior of "A 'ack' visor command"

    it should "properly execute w/o arguments" in {
        visor open("-d", false)
        visor ack()
        visor close()
    }

    it should "properly execute with arguments" in {
        visor open("-d", false)
        visor ack("Broadcasting!")
        visor close()
    }

    it should "print error message when not connected" in {
        visor ack()
    }
}
