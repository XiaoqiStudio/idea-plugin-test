package com.github.xiaoqistudio.ideaplugintest.services

import com.intellij.openapi.project.Project
import com.github.xiaoqistudio.ideaplugintest.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
