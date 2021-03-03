package com.github.quant0x2.inlinetitlebar.services

import com.github.quant0x2.inlinetitlebar.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
