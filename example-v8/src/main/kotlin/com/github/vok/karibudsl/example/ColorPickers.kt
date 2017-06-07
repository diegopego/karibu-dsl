/*
 * Copyright 2000-2013 Vaadin Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.github.vok.karibudsl.example

import com.github.vok.karibudsl.*
import com.vaadin.icons.VaadinIcons
import com.vaadin.navigator.View
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent
import com.vaadin.shared.ui.colorpicker.Color
import com.vaadin.ui.AbstractColorPicker.PopupStyle
import com.vaadin.ui.ColorPicker
import com.vaadin.ui.HorizontalLayout
import com.vaadin.ui.Label
import com.vaadin.ui.VerticalLayout
import com.vaadin.ui.themes.ValoTheme

@AutoView
class ColorPickers : VerticalLayout(), View {
    init {
        isSpacing = false

        label("Color Pickers") {
            addStyleNames(ValoTheme.LABEL_H2, ValoTheme.LABEL_COLORED)
        }

        horizontalLayout {
            styleName = ValoTheme.LAYOUT_HORIZONTAL_WRAPPING
            colorPicker {
                isDefaultCaptionEnabled = true
                value = Color(138, 73, 115)
            }
            colorPicker {
                popupStyle = PopupStyle.POPUP_SIMPLE
                textfieldVisibility = true
            }
        }
    }

    override fun enter(event: ViewChangeEvent) {
    }
}
