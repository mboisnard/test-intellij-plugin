package com.github.mboisnard.testintellijplugin.services

import com.intellij.openapi.project.Project
import com.github.mboisnard.testintellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
