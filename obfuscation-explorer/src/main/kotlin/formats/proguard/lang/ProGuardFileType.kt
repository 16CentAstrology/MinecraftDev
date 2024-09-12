/*
 * Minecraft Development for IntelliJ
 *
 * https://mcdev.io/
 *
 * Copyright (C) 2024 minecraft-dev
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published
 * by the Free Software Foundation, version 3.0 only.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package io.mcdev.obfex.formats.proguard.lang

import com.intellij.openapi.fileTypes.LanguageFileType
import io.mcdev.obfex.ObfIcons
import javax.swing.Icon

object ProGuardFileType : LanguageFileType(ProGuardLanguage) {

    override fun getName(): String = "ProGuard"
    override fun getDescription(): String = "ProGuard obfuscation mapping file"
    override fun getDefaultExtension(): String = "map"
    override fun getIcon(): Icon = ObfIcons.PROGUARD_ICONS
}
