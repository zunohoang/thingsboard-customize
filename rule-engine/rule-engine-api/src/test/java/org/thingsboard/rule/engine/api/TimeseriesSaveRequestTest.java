/**
 * Copyright © 2016-2024 The Thingsboard Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.thingsboard.rule.engine.api;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TimeseriesSaveRequestTest {

    @Test
    void testDefaultSaveActionsAreSaveAll() {
        var request = TimeseriesSaveRequest.builder().build();

        assertThat(request.getSaveActions()).isEqualTo(TimeseriesSaveRequest.SaveActions.SAVE_ALL);
    }

    @Test
    void testSaveActionsSaveAll() {
        assertThat(TimeseriesSaveRequest.SaveActions.SAVE_ALL).isEqualTo(new TimeseriesSaveRequest.SaveActions(true, true, true));
    }

    @Test
    void testSaveActionsWsOnly() {
        assertThat(TimeseriesSaveRequest.SaveActions.WS_ONLY).isEqualTo(new TimeseriesSaveRequest.SaveActions(false, false, true));
    }

    @Test
    void testSaveActionsLatestAndWs() {
        assertThat(TimeseriesSaveRequest.SaveActions.LATEST_AND_WS).isEqualTo(new TimeseriesSaveRequest.SaveActions(false, true, true));
    }

    @Test
    void testSaveActionsSkipAll() {
        assertThat(TimeseriesSaveRequest.SaveActions.SKIP_ALL).isEqualTo(new TimeseriesSaveRequest.SaveActions(false, false, false));
    }

}
