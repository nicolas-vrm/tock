/*
 * Copyright (C) 2017 VSCT
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package fr.vsct.tock.bot.admin.message

import fr.vsct.tock.translator.I18nLabelValue

/**
 *
 */
data class SentenceSubElementConfiguration(
    val attachments: List<AttachmentConfiguration> = emptyList(),
    val choices: List<ChoiceConfiguration> = emptyList(),
    val texts: Map<String, I18nLabelValue> = emptyMap(),
    val locations: List<LocationConfiguration> = emptyList(),
    val metadata: Map<String, String> = emptyMap()
) {
}