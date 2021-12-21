package com.github.blusliu.javakiller.services

import com.intellij.openapi.project.Project
import com.github.blusliu.javakiller.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
