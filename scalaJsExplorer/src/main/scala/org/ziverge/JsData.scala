package org.ziverge

import scala.collection.immutable.HashSet
import DependencyType.*

object JsData:
  val allProjectData =
    List(
      ProjectMetaData(
        project = Project(group = "dev.zio", artifactId = "zio"),
        version = "2.0.0-RC1",
        dependencies =
          HashSet(
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio-stacktracer"),
              version = "2.0.0-RC1"
            ),
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "izumi-reflect"),
              version = "2.0.8"
            ),
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio-internal-macros"),
              version = "2.0.0-RC1"
            )
          )
      ),
      ProjectMetaData(
        project = Project(group = "dev.zio", artifactId = "zio-test"),
        version = "2.0.0-RC1",
        dependencies =
          HashSet(
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio"),
              version = "2.0.0-RC1"
            ),
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio-streams"),
              version = "2.0.0-RC1"
            )
          )
      ),
      ProjectMetaData(
        project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
        version = "2.0.0-RC1",
        dependencies =
          HashSet(
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio"),
              version = "2.0.0-RC1"
            ),
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio-test"),
              version = "2.0.0-RC1"
            )
          )
      ),
      ProjectMetaData(
        project = Project(group = "dev.zio", artifactId = "zio-test-magnolia"),
        version = "2.0.0-RC1",
        dependencies =
          HashSet(
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio-test"),
              version = "2.0.0-RC1"
            )
          )
      ),
      ProjectMetaData(
        project = Project(group = "dev.zio", artifactId = "zio-internal-macros"),
        version = "2.0.0-RC1",
        dependencies = HashSet()
      ),
      ProjectMetaData(
        project = Project(group = "dev.zio", artifactId = "zio-stacktracer"),
        version = "2.0.0-RC1",
        dependencies = HashSet()
      ),
      ProjectMetaData(
        project = Project(group = "dev.zio", artifactId = "izumi-reflect"),
        version = "2.0.8",
        dependencies =
          Set(
            VersionedProject(
              project =
                Project(
                  group = "dev.zio",
                  artifactId = "izumi-reflect-thirdparty-boopickle-shaded"
                ),
              version = "2.0.8"
            )
          )
      ),
      ProjectMetaData(
        project = Project(group = "dev.zio", artifactId = "zio-streams"),
        version = "2.0.0-RC1",
        dependencies =
          HashSet(
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio"),
              version = "2.0.0-RC1"
            )
          )
      ),
      ProjectMetaData(
        project =
          Project(group = "dev.zio", artifactId = "izumi-reflect-thirdparty-boopickle-shaded"),
        version = "2.0.8",
        dependencies = Set()
      ),
      ProjectMetaData(
        project = Project(group = "com.github.ghostdogpr", artifactId = "caliban"),
        version = "1.3.1",
        dependencies =
          HashSet(
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio-query"),
              version = "0.2.10"
            ),
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio-streams"),
              version = "1.0.13"
            ),
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio-test"),
              version = "1.0.13"
            ),
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio"),
              version = "1.0.13"
            ),
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
              version = "1.0.13"
            ),
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio-json"),
              version = "0.1.5"
            )
          )
      ),
      ProjectMetaData(
        project = Project(group = "io.getquill", artifactId = "quill-jdbc-zio"),
        version = "3.12.0",
        dependencies =
          HashSet(
            VersionedProject(
              project = Project(group = "io.getquill", artifactId = "quill-zio"),
              version = "3.12.0"
            )
          )
      ),
      ProjectMetaData(
        project = Project(group = "io.getquill", artifactId = "quill-zio"),
        version = "3.12.0",
        dependencies =
          HashSet(
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio-streams"),
              version = "1.0.12"
            ),
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio"),
              version = "1.0.12"
            )
          )
      ),
      ProjectMetaData(
        project = Project(group = "nl.vroste", artifactId = "rezilience"),
        version = "0.7.0",
        dependencies =
          HashSet(
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio-test"),
              version = "1.0.12"
            ),
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio-streams"),
              version = "1.0.12"
            ),
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
              version = "1.0.12"
            )
          )
      ),
      ProjectMetaData(
        project = Project(group = "io.d11", artifactId = "zhttp"),
        version = "1.0.0.0-RC19",
        dependencies =
          HashSet(
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio-streams"),
              version = "1.0.13"
            ),
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio-test"),
              version = "1.0.13"
            ),
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio"),
              version = "1.0.13"
            ),
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
              version = "1.0.13"
            )
          )
      ),
      ProjectMetaData(
        project = Project(group = "dev.zio", artifactId = "zio-actors"),
        version = "0.0.9",
        dependencies =
          HashSet(
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio-nio"),
              version = "1.0.0-RC9"
            ),
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
              version = "1.0.3"
            ),
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio"),
              version = "1.0.3"
            ),
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio-test"),
              version = "1.0.3"
            ),
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio-config-typesafe"),
              version = "1.0.0-RC30-1"
            )
          )
      ),
      ProjectMetaData(
        project = Project(group = "dev.zio", artifactId = "zio-akka-cluster"),
        version = "0.2.0",
        dependencies =
          HashSet(
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio"),
              version = "1.0.0"
            ),
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
              version = "1.0.0"
            ),
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio-streams"),
              version = "1.0.0"
            ),
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio-test"),
              version = "1.0.0"
            )
          )
      ),
      ProjectMetaData(
        project = Project(group = "io.github.neurodyne", artifactId = "zio-arrow"),
        version = "0.2.1",
        dependencies =
          Set(
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio"),
              version = "1.0.0-RC20"
            ),
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio-test"),
              version = "1.0.0-RC20"
            ),
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
              version = "1.0.0-RC20"
            )
          )
      ),
      ProjectMetaData(
        project = Project(group = "io.github.vigoo", artifactId = "zio-aws-core"),
        version = "3.17.101.1",
        dependencies =
          HashSet(
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio-config"),
              version = "1.0.10"
            ),
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio-test"),
              version = "1.0.12"
            ),
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio-streams"),
              version = "1.0.12"
            ),
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio"),
              version = "1.0.12"
            ),
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio-config-typesafe"),
              version = "1.0.10"
            ),
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
              version = "1.0.12"
            )
          )
      ),
      ProjectMetaData(
        project = Project(group = "dev.zio", artifactId = "zio-cache"),
        version = "0.2.0-RC1",
        dependencies =
          HashSet(
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio"),
              version = "2.0.0-RC1"
            ),
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio-test"),
              version = "2.0.0-RC1"
            ),
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
              version = "2.0.0-RC1"
            )
          )
      ),
      ProjectMetaData(
        project = Project(group = "dev.zio", artifactId = "zio-config"),
        version = "1.0.10",
        dependencies =
          HashSet(
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
              version = "1.0.9"
            ),
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio"),
              version = "1.0.9"
            ),
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio-test"),
              version = "1.0.9"
            )
          )
      ),
      ProjectMetaData(
        project = Project(group = "dev.zio", artifactId = "zio-config-typesafe"),
        version = "1.0.10",
        dependencies =
          HashSet(
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio-config"),
              version = "1.0.10"
            ),
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
              version = "1.0.9"
            ),
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio-test"),
              version = "1.0.9"
            )
          )
      ),
      ProjectMetaData(
        project = Project(group = "dev.zio", artifactId = "zio-interop-cats"),
        version = "3.3.0-RC1",
        dependencies =
          HashSet(
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio-stacktracer"),
              version = "2.0.0-RC1"
            ),
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio"),
              version = "2.0.0-RC1"
            ),
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio-streams"),
              version = "2.0.0-RC1"
            )
          )
      ),
      ProjectMetaData(
        project = Project(group = "dev.zio", artifactId = "zio-json"),
        version = "0.3.0-RC1-1",
        dependencies =
          HashSet(
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio"),
              version = "2.0.0-RC1"
            ),
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio-test"),
              version = "2.0.0-RC1"
            ),
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio-streams"),
              version = "2.0.0-RC1"
            ),
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
              version = "2.0.0-RC1"
            )
          )
      ),
      ProjectMetaData(
        project = Project(group = "dev.zio", artifactId = "zio-kafka"),
        version = "0.17.3",
        dependencies =
          HashSet(
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio-test"),
              version = "1.0.12"
            ),
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio-streams"),
              version = "1.0.12"
            ),
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
              version = "1.0.12"
            )
          )
      ),
      ProjectMetaData(
        project = Project(group = "nl.vroste", artifactId = "zio-kinesis"),
        version = "5dd51766a6de8d3233c1846ad75deb185e05b8a0",
        dependencies =
          HashSet(
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio-test"),
              version = "1.0.4-2"
            ),
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio-logging"),
              version = "0.5.6"
            ),
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio"),
              version = "1.0.4-2"
            ),
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
              version = "1.0.4-2"
            ),
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio-streams"),
              version = "1.0.4-2"
            ),
            VersionedProject(
              project = Project(group = "io.github.vigoo", artifactId = "zio-aws-core"),
              version = "3.15.82.2"
            )
          )
      ),
      ProjectMetaData(
        project = Project(group = "dev.zio", artifactId = "zio-logging"),
        version = "0.5.14",
        dependencies =
          HashSet(
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio-test"),
              version = "1.0.12"
            ),
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio-streams"),
              version = "1.0.12"
            ),
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
              version = "1.0.12"
            ),
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio"),
              version = "1.0.12"
            )
          )
      ),
      ProjectMetaData(
        project = Project(group = "dev.zio", artifactId = "zio-metrics"),
        version = "1.0.13",
        dependencies =
          HashSet(
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio-test"),
              version = "1.0.12"
            ),
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio-streams"),
              version = "1.0.12"
            ),
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
              version = "1.0.12"
            ),
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio"),
              version = "1.0.12"
            )
          )
      ),
      ProjectMetaData(
        project = Project(group = "dev.zio", artifactId = "zio-nio"),
        version = "1.0.0-RC12",
        dependencies =
          HashSet(
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio-test"),
              version = "1.0.12"
            ),
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio-streams"),
              version = "1.0.12"
            ),
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
              version = "1.0.12"
            ),
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio"),
              version = "1.0.12"
            )
          )
      ),
      ProjectMetaData(
        project = Project(group = "dev.zio", artifactId = "zio-optics"),
        version = "0.2.0-RC1",
        dependencies =
          HashSet(
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio"),
              version = "2.0.0-RC1"
            ),
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio-test"),
              version = "2.0.0-RC1"
            ),
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
              version = "2.0.0-RC1"
            )
          )
      ),
      ProjectMetaData(
        project = Project(group = "dev.zio", artifactId = "zio-prelude"),
        version = "1.0.0-RC9",
        dependencies =
          HashSet(
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio"),
              version = "2.0.0-RC1"
            ),
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio-prelude-macros"),
              version = "1.0.0-RC9"
            ),
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio-streams"),
              version = "2.0.0-RC1"
            ),
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
              version = "2.0.0-RC1"
            )
          )
      ),
      ProjectMetaData(
        project = Project(group = "dev.zio", artifactId = "zio-prelude-macros"),
        version = "1.0.0-RC9",
        dependencies = HashSet()
      ),
      ProjectMetaData(
        project = Project(group = "dev.zio", artifactId = "zio-process"),
        version = "0.7.0-RC1",
        dependencies =
          HashSet(
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio"),
              version = "2.0.0-RC1"
            ),
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio-test"),
              version = "2.0.0-RC1"
            ),
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio-streams"),
              version = "2.0.0-RC1"
            ),
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
              version = "2.0.0-RC1"
            )
          )
      ),
      ProjectMetaData(
        project = Project(group = "dev.zio", artifactId = "zio-query"),
        version = "0.3.0-RC1",
        dependencies =
          HashSet(
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio"),
              version = "2.0.0-RC1"
            ),
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio-test"),
              version = "2.0.0-RC1"
            ),
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
              version = "2.0.0-RC1"
            )
          )
      ),
      ProjectMetaData(
        project = Project(group = "dev.zio", artifactId = "zio-schema"),
        version = "0.1.5",
        dependencies =
          HashSet(
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio-test"),
              version = "1.0.12"
            ),
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio-streams"),
              version = "1.0.12"
            ),
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio-prelude"),
              version = "1.0.0-RC7"
            ),
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
              version = "1.0.12"
            ),
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio"),
              version = "1.0.12"
            )
          )
      ),
      ProjectMetaData(
        project = Project(group = "dev.zio", artifactId = "zio-zmx"),
        version = "0.0.11",
        dependencies =
          HashSet(
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio-test"),
              version = "1.0.12"
            ),
            VersionedProject(
              project = Project(group = "io.d11", artifactId = "zhttp"),
              version = "1.0.0.0-RC17"
            ),
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio-json"),
              version = "0.2.0-M1"
            ),
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
              version = "1.0.12"
            ),
            VersionedProject(
              project = Project(group = "dev.zio", artifactId = "zio"),
              version = "1.0.12"
            )
          )
      )
    )
end JsData

object JsDataConnected:
  val connected =
    List(
      ConnectedProjectData(
        project = Project(group = "dev.zio", artifactId = "zio"),
        version = Version(value = "2.0.0-RC1"),
        dependencies =
          HashSet(
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-internal-macros"),
              version = "2.0.0-RC1",
              dependencies = HashSet()
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "izumi-reflect"),
              version = "2.0.8",
              dependencies =
                Set(
                  VersionedProject(
                    project =
                      Project(
                        group = "dev.zio",
                        artifactId = "izumi-reflect-thirdparty-boopickle-shaded"
                      ),
                    version = "2.0.8"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-stacktracer"),
              version = "2.0.0-RC1",
              dependencies = HashSet()
            )
          ),
        blockers = HashSet(),
        dependants =
          HashSet(
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-zmx"),
              version = "0.0.11",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "io.d11", artifactId = "zhttp"),
                    version = "1.0.0.0-RC17"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-json"),
                    version = "0.2.0-M1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "1.0.12"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-optics"),
              version = "0.2.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "io.getquill", artifactId = "quill-zio"),
              version = "3.12.0",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "1.0.12"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-cache"),
              version = "0.2.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-actors"),
              version = "0.0.9",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-nio"),
                    version = "1.0.0-RC9"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.3"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "1.0.3"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.3"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-config-typesafe"),
                    version = "1.0.0-RC30-1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-nio"),
              version = "1.0.0-RC12",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "1.0.12"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "io.github.vigoo", artifactId = "zio-aws-core"),
              version = "3.17.101.1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-config"),
                    version = "1.0.10"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-config-typesafe"),
                    version = "1.0.10"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.12"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "io.d11", artifactId = "zhttp"),
              version = "1.0.0.0-RC19",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "1.0.13"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.13"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "1.0.13"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.13"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-json"),
              version = "0.3.0-RC1-1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-prelude"),
              version = "1.0.0-RC9",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-prelude-macros"),
                    version = "1.0.0-RC9"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-test"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-akka-cluster"),
              version = "0.2.0",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "1.0.0"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.0"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "1.0.0"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.0"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "io.github.neurodyne", artifactId = "zio-arrow"),
              version = "0.2.1",
              dependencies =
                Set(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "1.0.0-RC20"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.0-RC20"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.0-RC20"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-metrics"),
              version = "1.0.13",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "1.0.12"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-streams"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-interop-cats"),
              version = "3.3.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-stacktracer"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-query"),
              version = "0.3.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-schema"),
              version = "0.1.5",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-prelude"),
                    version = "1.0.0-RC7"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "1.0.12"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-logging"),
              version = "0.5.14",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "1.0.12"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-process"),
              version = "0.7.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "com.github.ghostdogpr", artifactId = "caliban"),
              version = "1.3.1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-query"),
                    version = "0.2.10"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "1.0.13"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.13"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "1.0.13"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.13"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-json"),
                    version = "0.1.5"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-config"),
              version = "1.0.10",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.9"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "1.0.9"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.9"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "nl.vroste", artifactId = "zio-kinesis"),
              version = "5dd51766a6de8d3233c1846ad75deb185e05b8a0",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.4-2"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-logging"),
                    version = "0.5.6"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "1.0.4-2"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.4-2"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "1.0.4-2"
                  ),
                  VersionedProject(
                    project = Project(group = "io.github.vigoo", artifactId = "zio-aws-core"),
                    version = "3.15.82.2"
                  )
                )
            )
          ),
        zioDep = None
      ),
      ConnectedProjectData(
        project = Project(group = "dev.zio", artifactId = "zio-test"),
        version = Version(value = "2.0.0-RC1"),
        dependencies =
          HashSet(
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-stacktracer"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "izumi-reflect"),
                    version = "2.0.8"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-internal-macros"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-streams"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  )
                )
            )
          ),
        blockers = HashSet(),
        dependants =
          HashSet(
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-json"),
              version = "0.3.0-RC1-1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-zmx"),
              version = "0.0.11",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "io.d11", artifactId = "zhttp"),
                    version = "1.0.0.0-RC17"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-json"),
                    version = "0.2.0-M1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "1.0.12"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-akka-cluster"),
              version = "0.2.0",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "1.0.0"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.0"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "1.0.0"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.0"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-optics"),
              version = "0.2.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-actors"),
              version = "0.0.9",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-nio"),
                    version = "1.0.0-RC9"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.3"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "1.0.3"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.3"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-config-typesafe"),
                    version = "1.0.0-RC30-1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-nio"),
              version = "1.0.0-RC12",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "1.0.12"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-kafka"),
              version = "0.17.3",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.12"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "io.github.vigoo", artifactId = "zio-aws-core"),
              version = "3.17.101.1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-config"),
                    version = "1.0.10"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-config-typesafe"),
                    version = "1.0.10"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.12"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-config-typesafe"),
              version = "1.0.10",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-config"),
                    version = "1.0.10"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.9"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.9"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "io.d11", artifactId = "zhttp"),
              version = "1.0.0.0-RC19",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "1.0.13"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.13"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "1.0.13"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.13"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-test-magnolia"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-cache"),
              version = "0.2.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "nl.vroste", artifactId = "rezilience"),
              version = "0.7.0",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.12"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "io.github.neurodyne", artifactId = "zio-arrow"),
              version = "0.2.1",
              dependencies =
                Set(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "1.0.0-RC20"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.0-RC20"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.0-RC20"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-metrics"),
              version = "1.0.13",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "1.0.12"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-query"),
              version = "0.3.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-schema"),
              version = "0.1.5",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-prelude"),
                    version = "1.0.0-RC7"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "1.0.12"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-logging"),
              version = "0.5.14",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "1.0.12"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-process"),
              version = "0.7.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "com.github.ghostdogpr", artifactId = "caliban"),
              version = "1.3.1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-query"),
                    version = "0.2.10"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "1.0.13"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.13"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "1.0.13"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.13"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-json"),
                    version = "0.1.5"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-config"),
              version = "1.0.10",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.9"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "1.0.9"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.9"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "nl.vroste", artifactId = "zio-kinesis"),
              version = "5dd51766a6de8d3233c1846ad75deb185e05b8a0",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.4-2"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-logging"),
                    version = "0.5.6"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "1.0.4-2"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.4-2"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "1.0.4-2"
                  ),
                  VersionedProject(
                    project = Project(group = "io.github.vigoo", artifactId = "zio-aws-core"),
                    version = "3.15.82.2"
                  )
                )
            )
          ),
        zioDep =
          Some(value =
            ZioDep(
              zioDep =
                VersionedProject(
                  project = Project(group = "dev.zio", artifactId = "zio"),
                  version = "2.0.0-RC1"
                ),
              dependencyType = Direct
            )
          )
      ),
      ConnectedProjectData(
        project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
        version = Version(value = "2.0.0-RC1"),
        dependencies =
          HashSet(
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-stacktracer"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "izumi-reflect"),
                    version = "2.0.8"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-internal-macros"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-test"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "2.0.0-RC1"
                  )
                )
            )
          ),
        blockers = HashSet(),
        dependants =
          HashSet(
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-zmx"),
              version = "0.0.11",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "io.d11", artifactId = "zhttp"),
                    version = "1.0.0.0-RC17"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-json"),
                    version = "0.2.0-M1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "1.0.12"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-akka-cluster"),
              version = "0.2.0",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "1.0.0"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.0"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "1.0.0"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.0"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-optics"),
              version = "0.2.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-actors"),
              version = "0.0.9",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-nio"),
                    version = "1.0.0-RC9"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.3"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "1.0.3"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.3"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-config-typesafe"),
                    version = "1.0.0-RC30-1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-nio"),
              version = "1.0.0-RC12",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "1.0.12"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-kafka"),
              version = "0.17.3",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.12"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "io.github.vigoo", artifactId = "zio-aws-core"),
              version = "3.17.101.1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-config"),
                    version = "1.0.10"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-config-typesafe"),
                    version = "1.0.10"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.12"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-config-typesafe"),
              version = "1.0.10",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-config"),
                    version = "1.0.10"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.9"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.9"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "io.d11", artifactId = "zhttp"),
              version = "1.0.0.0-RC19",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "1.0.13"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.13"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "1.0.13"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.13"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-json"),
              version = "0.3.0-RC1-1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-prelude"),
              version = "1.0.0-RC9",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-prelude-macros"),
                    version = "1.0.0-RC9"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-cache"),
              version = "0.2.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "nl.vroste", artifactId = "rezilience"),
              version = "0.7.0",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.12"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "io.github.neurodyne", artifactId = "zio-arrow"),
              version = "0.2.1",
              dependencies =
                Set(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "1.0.0-RC20"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.0-RC20"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.0-RC20"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-metrics"),
              version = "1.0.13",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "1.0.12"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-query"),
              version = "0.3.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-schema"),
              version = "0.1.5",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-prelude"),
                    version = "1.0.0-RC7"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "1.0.12"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-logging"),
              version = "0.5.14",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "1.0.12"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-process"),
              version = "0.7.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "com.github.ghostdogpr", artifactId = "caliban"),
              version = "1.3.1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-query"),
                    version = "0.2.10"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "1.0.13"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.13"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "1.0.13"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.13"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-json"),
                    version = "0.1.5"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-config"),
              version = "1.0.10",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.9"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "1.0.9"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.9"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "nl.vroste", artifactId = "zio-kinesis"),
              version = "5dd51766a6de8d3233c1846ad75deb185e05b8a0",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.4-2"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-logging"),
                    version = "0.5.6"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "1.0.4-2"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.4-2"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "1.0.4-2"
                  ),
                  VersionedProject(
                    project = Project(group = "io.github.vigoo", artifactId = "zio-aws-core"),
                    version = "3.15.82.2"
                  )
                )
            )
          ),
        zioDep =
          Some(value =
            ZioDep(
              zioDep =
                VersionedProject(
                  project = Project(group = "dev.zio", artifactId = "zio"),
                  version = "2.0.0-RC1"
                ),
              dependencyType = Direct
            )
          )
      ),
      ConnectedProjectData(
        project = Project(group = "dev.zio", artifactId = "zio-test-magnolia"),
        version = Version(value = "2.0.0-RC1"),
        dependencies =
          HashSet(
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-test"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "2.0.0-RC1"
                  )
                )
            )
          ),
        blockers = HashSet(),
        dependants = Set(),
        zioDep =
          Some(value =
            ZioDep(
              zioDep =
                VersionedProject(
                  project = Project(group = "dev.zio", artifactId = "zio"),
                  version = "2.0.0-RC1"
                ),
              dependencyType = Transitive
            )
          )
      ),
      ConnectedProjectData(
        project = Project(group = "dev.zio", artifactId = "zio-internal-macros"),
        version = Version(value = "2.0.0-RC1"),
        dependencies = Set(),
        blockers = Set(),
        dependants =
          Set(
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-stacktracer"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "izumi-reflect"),
                    version = "2.0.8"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-internal-macros"),
                    version = "2.0.0-RC1"
                  )
                )
            )
          ),
        zioDep = None
      ),
      ConnectedProjectData(
        project = Project(group = "dev.zio", artifactId = "zio-stacktracer"),
        version = Version(value = "2.0.0-RC1"),
        dependencies = Set(),
        blockers = Set(),
        dependants =
          Set(
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-interop-cats"),
              version = "3.3.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-stacktracer"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-stacktracer"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "izumi-reflect"),
                    version = "2.0.8"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-internal-macros"),
                    version = "2.0.0-RC1"
                  )
                )
            )
          ),
        zioDep = None
      ),
      ConnectedProjectData(
        project = Project(group = "dev.zio", artifactId = "izumi-reflect"),
        version = Version(value = "2.0.8"),
        dependencies =
          Set(
            ProjectMetaData(
              project =
                Project(
                  group = "dev.zio",
                  artifactId = "izumi-reflect-thirdparty-boopickle-shaded"
                ),
              version = "2.0.8",
              dependencies = Set()
            )
          ),
        blockers = Set(),
        dependants =
          Set(
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-stacktracer"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "izumi-reflect"),
                    version = "2.0.8"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-internal-macros"),
                    version = "2.0.0-RC1"
                  )
                )
            )
          ),
        zioDep = None
      ),
      ConnectedProjectData(
        project = Project(group = "dev.zio", artifactId = "zio-streams"),
        version = Version(value = "2.0.0-RC1"),
        dependencies =
          HashSet(
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-stacktracer"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "izumi-reflect"),
                    version = "2.0.8"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-internal-macros"),
                    version = "2.0.0-RC1"
                  )
                )
            )
          ),
        blockers = HashSet(),
        dependants =
          HashSet(
            ProjectMetaData(
              project = Project(group = "io.getquill", artifactId = "quill-zio"),
              version = "3.12.0",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "1.0.12"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "nl.vroste", artifactId = "rezilience"),
              version = "0.7.0",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.12"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-nio"),
              version = "1.0.0-RC12",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "1.0.12"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-kafka"),
              version = "0.17.3",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.12"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "io.github.vigoo", artifactId = "zio-aws-core"),
              version = "3.17.101.1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-config"),
                    version = "1.0.10"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-config-typesafe"),
                    version = "1.0.10"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.12"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "nl.vroste", artifactId = "zio-kinesis"),
              version = "5dd51766a6de8d3233c1846ad75deb185e05b8a0",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.4-2"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-logging"),
                    version = "0.5.6"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "1.0.4-2"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.4-2"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "1.0.4-2"
                  ),
                  VersionedProject(
                    project = Project(group = "io.github.vigoo", artifactId = "zio-aws-core"),
                    version = "3.15.82.2"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "io.d11", artifactId = "zhttp"),
              version = "1.0.0.0-RC19",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "1.0.13"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.13"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "1.0.13"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.13"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-json"),
              version = "0.3.0-RC1-1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-prelude"),
              version = "1.0.0-RC9",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-prelude-macros"),
                    version = "1.0.0-RC9"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-test"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-akka-cluster"),
              version = "0.2.0",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "1.0.0"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.0"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "1.0.0"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.0"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-metrics"),
              version = "1.0.13",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "1.0.12"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-interop-cats"),
              version = "3.3.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-stacktracer"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-schema"),
              version = "0.1.5",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-prelude"),
                    version = "1.0.0-RC7"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "1.0.12"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-logging"),
              version = "0.5.14",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "1.0.12"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-process"),
              version = "0.7.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "com.github.ghostdogpr", artifactId = "caliban"),
              version = "1.3.1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-query"),
                    version = "0.2.10"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "1.0.13"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.13"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "1.0.13"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.13"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-json"),
                    version = "0.1.5"
                  )
                )
            )
          ),
        zioDep =
          Some(value =
            ZioDep(
              zioDep =
                VersionedProject(
                  project = Project(group = "dev.zio", artifactId = "zio"),
                  version = "2.0.0-RC1"
                ),
              dependencyType = Direct
            )
          )
      ),
      ConnectedProjectData(
        project =
          Project(group = "dev.zio", artifactId = "izumi-reflect-thirdparty-boopickle-shaded"),
        version = Version(value = "2.0.8"),
        dependencies = Set(),
        blockers = Set(),
        dependants =
          Set(
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "izumi-reflect"),
              version = "2.0.8",
              dependencies =
                Set(
                  VersionedProject(
                    project =
                      Project(
                        group = "dev.zio",
                        artifactId = "izumi-reflect-thirdparty-boopickle-shaded"
                      ),
                    version = "2.0.8"
                  )
                )
            )
          ),
        zioDep = None
      ),
      ConnectedProjectData(
        project = Project(group = "com.github.ghostdogpr", artifactId = "caliban"),
        version = Version(value = "1.3.1"),
        dependencies =
          HashSet(
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-test"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-stacktracer"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "izumi-reflect"),
                    version = "2.0.8"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-internal-macros"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-json"),
              version = "0.3.0-RC1-1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-streams"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-query"),
              version = "0.3.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "2.0.0-RC1"
                  )
                )
            )
          ),
        blockers = HashSet(),
        dependants = Set(),
        zioDep =
          Some(value =
            ZioDep(
              zioDep =
                VersionedProject(
                  project = Project(group = "dev.zio", artifactId = "zio"),
                  version = "1.0.13"
                ),
              dependencyType = Direct
            )
          )
      ),
      ConnectedProjectData(
        project = Project(group = "io.getquill", artifactId = "quill-jdbc-zio"),
        version = Version(value = "3.12.0"),
        dependencies =
          HashSet(
            ProjectMetaData(
              project = Project(group = "io.getquill", artifactId = "quill-zio"),
              version = "3.12.0",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "1.0.12"
                  )
                )
            )
          ),
        blockers =
          HashSet(
            ProjectMetaData(
              project = Project(group = "io.getquill", artifactId = "quill-zio"),
              version = "3.12.0",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "1.0.12"
                  )
                )
            )
          ),
        dependants = Set(),
        zioDep =
          Some(value =
            ZioDep(
              zioDep =
                VersionedProject(
                  project = Project(group = "dev.zio", artifactId = "zio"),
                  version = "1.0.12"
                ),
              dependencyType = Transitive
            )
          )
      ),
      ConnectedProjectData(
        project = Project(group = "io.getquill", artifactId = "quill-zio"),
        version = Version(value = "3.12.0"),
        dependencies =
          HashSet(
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-stacktracer"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "izumi-reflect"),
                    version = "2.0.8"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-internal-macros"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-streams"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  )
                )
            )
          ),
        blockers = HashSet(),
        dependants =
          Set(
            ProjectMetaData(
              project = Project(group = "io.getquill", artifactId = "quill-jdbc-zio"),
              version = "3.12.0",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "io.getquill", artifactId = "quill-zio"),
                    version = "3.12.0"
                  )
                )
            )
          ),
        zioDep =
          Some(value =
            ZioDep(
              zioDep =
                VersionedProject(
                  project = Project(group = "dev.zio", artifactId = "zio"),
                  version = "1.0.12"
                ),
              dependencyType = Direct
            )
          )
      ),
      ConnectedProjectData(
        project = Project(group = "nl.vroste", artifactId = "rezilience"),
        version = Version(value = "0.7.0"),
        dependencies =
          HashSet(
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-test"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-streams"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  )
                )
            )
          ),
        blockers = HashSet(),
        dependants = Set(),
        zioDep =
          Some(value =
            ZioDep(
              zioDep =
                VersionedProject(
                  project = Project(group = "dev.zio", artifactId = "zio"),
                  version = "2.0.0-RC1"
                ),
              dependencyType = Transitive
            )
          )
      ),
      ConnectedProjectData(
        project = Project(group = "io.d11", artifactId = "zhttp"),
        version = Version(value = "1.0.0.0-RC19"),
        dependencies =
          HashSet(
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-stacktracer"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "izumi-reflect"),
                    version = "2.0.8"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-internal-macros"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-test"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-streams"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  )
                )
            )
          ),
        blockers = HashSet(),
        dependants =
          Set(
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-zmx"),
              version = "0.0.11",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "io.d11", artifactId = "zhttp"),
                    version = "1.0.0.0-RC17"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-json"),
                    version = "0.2.0-M1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "1.0.12"
                  )
                )
            )
          ),
        zioDep =
          Some(value =
            ZioDep(
              zioDep =
                VersionedProject(
                  project = Project(group = "dev.zio", artifactId = "zio"),
                  version = "1.0.13"
                ),
              dependencyType = Direct
            )
          )
      ),
      ConnectedProjectData(
        project = Project(group = "dev.zio", artifactId = "zio-actors"),
        version = Version(value = "0.0.9"),
        dependencies =
          HashSet(
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-stacktracer"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "izumi-reflect"),
                    version = "2.0.8"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-internal-macros"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-test"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-nio"),
              version = "1.0.0-RC12",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "1.0.12"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-config-typesafe"),
              version = "1.0.10",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-config"),
                    version = "1.0.10"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.9"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.9"
                  )
                )
            )
          ),
        blockers =
          HashSet(
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-nio"),
              version = "1.0.0-RC12",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "1.0.12"
                  )
                )
            )
          ),
        dependants = Set(),
        zioDep =
          Some(value =
            ZioDep(
              zioDep =
                VersionedProject(
                  project = Project(group = "dev.zio", artifactId = "zio"),
                  version = "1.0.3"
                ),
              dependencyType = Direct
            )
          )
      ),
      ConnectedProjectData(
        project = Project(group = "dev.zio", artifactId = "zio-akka-cluster"),
        version = Version(value = "0.2.0"),
        dependencies =
          HashSet(
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-stacktracer"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "izumi-reflect"),
                    version = "2.0.8"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-internal-macros"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-test"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-streams"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  )
                )
            )
          ),
        blockers = HashSet(),
        dependants = Set(),
        zioDep =
          Some(value =
            ZioDep(
              zioDep =
                VersionedProject(
                  project = Project(group = "dev.zio", artifactId = "zio"),
                  version = "1.0.0"
                ),
              dependencyType = Direct
            )
          )
      ),
      ConnectedProjectData(
        project = Project(group = "io.github.neurodyne", artifactId = "zio-arrow"),
        version = Version(value = "0.2.1"),
        dependencies =
          Set(
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-stacktracer"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "izumi-reflect"),
                    version = "2.0.8"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-internal-macros"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-test"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "2.0.0-RC1"
                  )
                )
            )
          ),
        blockers = Set(),
        dependants = Set(),
        zioDep =
          Some(value =
            ZioDep(
              zioDep =
                VersionedProject(
                  project = Project(group = "dev.zio", artifactId = "zio"),
                  version = "1.0.0-RC20"
                ),
              dependencyType = Direct
            )
          )
      ),
      ConnectedProjectData(
        project = Project(group = "io.github.vigoo", artifactId = "zio-aws-core"),
        version = Version(value = "3.17.101.1"),
        dependencies =
          HashSet(
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-stacktracer"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "izumi-reflect"),
                    version = "2.0.8"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-internal-macros"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-test"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-streams"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-config-typesafe"),
              version = "1.0.10",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-config"),
                    version = "1.0.10"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.9"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.9"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-config"),
              version = "1.0.10",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.9"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "1.0.9"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.9"
                  )
                )
            )
          ),
        blockers =
          HashSet(
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-config"),
              version = "1.0.10",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.9"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "1.0.9"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.9"
                  )
                )
            )
          ),
        dependants =
          Set(
            ProjectMetaData(
              project = Project(group = "nl.vroste", artifactId = "zio-kinesis"),
              version = "5dd51766a6de8d3233c1846ad75deb185e05b8a0",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.4-2"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-logging"),
                    version = "0.5.6"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "1.0.4-2"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.4-2"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "1.0.4-2"
                  ),
                  VersionedProject(
                    project = Project(group = "io.github.vigoo", artifactId = "zio-aws-core"),
                    version = "3.15.82.2"
                  )
                )
            )
          ),
        zioDep =
          Some(value =
            ZioDep(
              zioDep =
                VersionedProject(
                  project = Project(group = "dev.zio", artifactId = "zio"),
                  version = "1.0.12"
                ),
              dependencyType = Direct
            )
          )
      ),
      ConnectedProjectData(
        project = Project(group = "dev.zio", artifactId = "zio-cache"),
        version = Version(value = "0.2.0-RC1"),
        dependencies =
          HashSet(
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-stacktracer"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "izumi-reflect"),
                    version = "2.0.8"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-internal-macros"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-test"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "2.0.0-RC1"
                  )
                )
            )
          ),
        blockers = HashSet(),
        dependants = Set(),
        zioDep =
          Some(value =
            ZioDep(
              zioDep =
                VersionedProject(
                  project = Project(group = "dev.zio", artifactId = "zio"),
                  version = "2.0.0-RC1"
                ),
              dependencyType = Direct
            )
          )
      ),
      ConnectedProjectData(
        project = Project(group = "dev.zio", artifactId = "zio-config"),
        version = Version(value = "1.0.10"),
        dependencies =
          HashSet(
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-stacktracer"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "izumi-reflect"),
                    version = "2.0.8"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-internal-macros"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-test"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "2.0.0-RC1"
                  )
                )
            )
          ),
        blockers = HashSet(),
        dependants =
          Set(
            ProjectMetaData(
              project = Project(group = "io.github.vigoo", artifactId = "zio-aws-core"),
              version = "3.17.101.1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-config"),
                    version = "1.0.10"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-config-typesafe"),
                    version = "1.0.10"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.12"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-config-typesafe"),
              version = "1.0.10",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-config"),
                    version = "1.0.10"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.9"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.9"
                  )
                )
            )
          ),
        zioDep =
          Some(value =
            ZioDep(
              zioDep =
                VersionedProject(
                  project = Project(group = "dev.zio", artifactId = "zio"),
                  version = "1.0.9"
                ),
              dependencyType = Direct
            )
          )
      ),
      ConnectedProjectData(
        project = Project(group = "dev.zio", artifactId = "zio-config-typesafe"),
        version = Version(value = "1.0.10"),
        dependencies =
          HashSet(
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-test"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-config"),
              version = "1.0.10",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.9"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "1.0.9"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.9"
                  )
                )
            )
          ),
        blockers =
          HashSet(
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-config"),
              version = "1.0.10",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.9"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "1.0.9"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.9"
                  )
                )
            )
          ),
        dependants =
          Set(
            ProjectMetaData(
              project = Project(group = "io.github.vigoo", artifactId = "zio-aws-core"),
              version = "3.17.101.1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-config"),
                    version = "1.0.10"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-config-typesafe"),
                    version = "1.0.10"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.12"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-actors"),
              version = "0.0.9",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-nio"),
                    version = "1.0.0-RC9"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.3"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "1.0.3"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.3"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-config-typesafe"),
                    version = "1.0.0-RC30-1"
                  )
                )
            )
          ),
        zioDep =
          Some(value =
            ZioDep(
              zioDep =
                VersionedProject(
                  project = Project(group = "dev.zio", artifactId = "zio"),
                  version = "1.0.9"
                ),
              dependencyType = Transitive
            )
          )
      ),
      ConnectedProjectData(
        project = Project(group = "dev.zio", artifactId = "zio-interop-cats"),
        version = Version(value = "3.3.0-RC1"),
        dependencies =
          HashSet(
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-stacktracer"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "izumi-reflect"),
                    version = "2.0.8"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-internal-macros"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-streams"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-stacktracer"),
              version = "2.0.0-RC1",
              dependencies = HashSet()
            )
          ),
        blockers = HashSet(),
        dependants = Set(),
        zioDep =
          Some(value =
            ZioDep(
              zioDep =
                VersionedProject(
                  project = Project(group = "dev.zio", artifactId = "zio"),
                  version = "2.0.0-RC1"
                ),
              dependencyType = Direct
            )
          )
      ),
      ConnectedProjectData(
        project = Project(group = "dev.zio", artifactId = "zio-json"),
        version = Version(value = "0.3.0-RC1-1"),
        dependencies =
          HashSet(
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-stacktracer"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "izumi-reflect"),
                    version = "2.0.8"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-internal-macros"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-test"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-streams"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  )
                )
            )
          ),
        blockers = HashSet(),
        dependants =
          Set(
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-zmx"),
              version = "0.0.11",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "io.d11", artifactId = "zhttp"),
                    version = "1.0.0.0-RC17"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-json"),
                    version = "0.2.0-M1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "1.0.12"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "com.github.ghostdogpr", artifactId = "caliban"),
              version = "1.3.1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-query"),
                    version = "0.2.10"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "1.0.13"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.13"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "1.0.13"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.13"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-json"),
                    version = "0.1.5"
                  )
                )
            )
          ),
        zioDep =
          Some(value =
            ZioDep(
              zioDep =
                VersionedProject(
                  project = Project(group = "dev.zio", artifactId = "zio"),
                  version = "2.0.0-RC1"
                ),
              dependencyType = Direct
            )
          )
      ),
      ConnectedProjectData(
        project = Project(group = "dev.zio", artifactId = "zio-kafka"),
        version = Version(value = "0.17.3"),
        dependencies =
          HashSet(
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-test"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-streams"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  )
                )
            )
          ),
        blockers = HashSet(),
        dependants = Set(),
        zioDep =
          Some(value =
            ZioDep(
              zioDep =
                VersionedProject(
                  project = Project(group = "dev.zio", artifactId = "zio"),
                  version = "2.0.0-RC1"
                ),
              dependencyType = Transitive
            )
          )
      ),
      ConnectedProjectData(
        project = Project(group = "nl.vroste", artifactId = "zio-kinesis"),
        version = Version(value = "5dd51766a6de8d3233c1846ad75deb185e05b8a0"),
        dependencies =
          HashSet(
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-stacktracer"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "izumi-reflect"),
                    version = "2.0.8"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-internal-macros"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-test"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-streams"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-logging"),
              version = "0.5.14",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "1.0.12"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "io.github.vigoo", artifactId = "zio-aws-core"),
              version = "3.17.101.1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-config"),
                    version = "1.0.10"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-config-typesafe"),
                    version = "1.0.10"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.12"
                  )
                )
            )
          ),
        blockers =
          HashSet(
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-logging"),
              version = "0.5.14",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "1.0.12"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "io.github.vigoo", artifactId = "zio-aws-core"),
              version = "3.17.101.1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-config"),
                    version = "1.0.10"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-config-typesafe"),
                    version = "1.0.10"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.12"
                  )
                )
            )
          ),
        dependants = Set(),
        zioDep =
          Some(value =
            ZioDep(
              zioDep =
                VersionedProject(
                  project = Project(group = "dev.zio", artifactId = "zio"),
                  version = "1.0.4-2"
                ),
              dependencyType = Direct
            )
          )
      ),
      ConnectedProjectData(
        project = Project(group = "dev.zio", artifactId = "zio-logging"),
        version = Version(value = "0.5.14"),
        dependencies =
          HashSet(
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-stacktracer"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "izumi-reflect"),
                    version = "2.0.8"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-internal-macros"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-test"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-streams"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  )
                )
            )
          ),
        blockers = HashSet(),
        dependants =
          Set(
            ProjectMetaData(
              project = Project(group = "nl.vroste", artifactId = "zio-kinesis"),
              version = "5dd51766a6de8d3233c1846ad75deb185e05b8a0",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.4-2"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-logging"),
                    version = "0.5.6"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "1.0.4-2"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.4-2"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "1.0.4-2"
                  ),
                  VersionedProject(
                    project = Project(group = "io.github.vigoo", artifactId = "zio-aws-core"),
                    version = "3.15.82.2"
                  )
                )
            )
          ),
        zioDep =
          Some(value =
            ZioDep(
              zioDep =
                VersionedProject(
                  project = Project(group = "dev.zio", artifactId = "zio"),
                  version = "1.0.12"
                ),
              dependencyType = Direct
            )
          )
      ),
      ConnectedProjectData(
        project = Project(group = "dev.zio", artifactId = "zio-metrics"),
        version = Version(value = "1.0.13"),
        dependencies =
          HashSet(
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-stacktracer"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "izumi-reflect"),
                    version = "2.0.8"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-internal-macros"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-test"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-streams"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  )
                )
            )
          ),
        blockers = HashSet(),
        dependants = Set(),
        zioDep =
          Some(value =
            ZioDep(
              zioDep =
                VersionedProject(
                  project = Project(group = "dev.zio", artifactId = "zio"),
                  version = "1.0.12"
                ),
              dependencyType = Direct
            )
          )
      ),
      ConnectedProjectData(
        project = Project(group = "dev.zio", artifactId = "zio-nio"),
        version = Version(value = "1.0.0-RC12"),
        dependencies =
          HashSet(
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-stacktracer"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "izumi-reflect"),
                    version = "2.0.8"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-internal-macros"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-test"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-streams"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  )
                )
            )
          ),
        blockers = HashSet(),
        dependants =
          Set(
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-actors"),
              version = "0.0.9",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-nio"),
                    version = "1.0.0-RC9"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.3"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "1.0.3"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.3"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-config-typesafe"),
                    version = "1.0.0-RC30-1"
                  )
                )
            )
          ),
        zioDep =
          Some(value =
            ZioDep(
              zioDep =
                VersionedProject(
                  project = Project(group = "dev.zio", artifactId = "zio"),
                  version = "1.0.12"
                ),
              dependencyType = Direct
            )
          )
      ),
      ConnectedProjectData(
        project = Project(group = "dev.zio", artifactId = "zio-optics"),
        version = Version(value = "0.2.0-RC1"),
        dependencies =
          HashSet(
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-stacktracer"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "izumi-reflect"),
                    version = "2.0.8"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-internal-macros"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-test"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "2.0.0-RC1"
                  )
                )
            )
          ),
        blockers = HashSet(),
        dependants = Set(),
        zioDep =
          Some(value =
            ZioDep(
              zioDep =
                VersionedProject(
                  project = Project(group = "dev.zio", artifactId = "zio"),
                  version = "2.0.0-RC1"
                ),
              dependencyType = Direct
            )
          )
      ),
      ConnectedProjectData(
        project = Project(group = "dev.zio", artifactId = "zio-prelude"),
        version = Version(value = "1.0.0-RC9"),
        dependencies =
          HashSet(
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-stacktracer"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "izumi-reflect"),
                    version = "2.0.8"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-internal-macros"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-prelude-macros"),
              version = "1.0.0-RC9",
              dependencies = HashSet()
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-streams"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  )
                )
            )
          ),
        blockers = HashSet(),
        dependants =
          Set(
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-schema"),
              version = "0.1.5",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-prelude"),
                    version = "1.0.0-RC7"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.12"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "1.0.12"
                  )
                )
            )
          ),
        zioDep =
          Some(value =
            ZioDep(
              zioDep =
                VersionedProject(
                  project = Project(group = "dev.zio", artifactId = "zio"),
                  version = "2.0.0-RC1"
                ),
              dependencyType = Direct
            )
          )
      ),
      ConnectedProjectData(
        project = Project(group = "dev.zio", artifactId = "zio-prelude-macros"),
        version = Version(value = "1.0.0-RC9"),
        dependencies = Set(),
        blockers = Set(),
        dependants =
          Set(
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-prelude"),
              version = "1.0.0-RC9",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-prelude-macros"),
                    version = "1.0.0-RC9"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "2.0.0-RC1"
                  )
                )
            )
          ),
        zioDep = None
      ),
      ConnectedProjectData(
        project = Project(group = "dev.zio", artifactId = "zio-process"),
        version = Version(value = "0.7.0-RC1"),
        dependencies =
          HashSet(
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-stacktracer"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "izumi-reflect"),
                    version = "2.0.8"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-internal-macros"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-test"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-streams"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  )
                )
            )
          ),
        blockers = HashSet(),
        dependants = Set(),
        zioDep =
          Some(value =
            ZioDep(
              zioDep =
                VersionedProject(
                  project = Project(group = "dev.zio", artifactId = "zio"),
                  version = "2.0.0-RC1"
                ),
              dependencyType = Direct
            )
          )
      ),
      ConnectedProjectData(
        project = Project(group = "dev.zio", artifactId = "zio-query"),
        version = Version(value = "0.3.0-RC1"),
        dependencies =
          HashSet(
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-stacktracer"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "izumi-reflect"),
                    version = "2.0.8"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-internal-macros"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-test"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "2.0.0-RC1"
                  )
                )
            )
          ),
        blockers = HashSet(),
        dependants =
          Set(
            ProjectMetaData(
              project = Project(group = "com.github.ghostdogpr", artifactId = "caliban"),
              version = "1.3.1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-query"),
                    version = "0.2.10"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "1.0.13"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.13"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "1.0.13"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.13"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-json"),
                    version = "0.1.5"
                  )
                )
            )
          ),
        zioDep =
          Some(value =
            ZioDep(
              zioDep =
                VersionedProject(
                  project = Project(group = "dev.zio", artifactId = "zio"),
                  version = "2.0.0-RC1"
                ),
              dependencyType = Direct
            )
          )
      ),
      ConnectedProjectData(
        project = Project(group = "dev.zio", artifactId = "zio-schema"),
        version = Version(value = "0.1.5"),
        dependencies =
          HashSet(
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-test"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-streams"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-stacktracer"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "izumi-reflect"),
                    version = "2.0.8"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-internal-macros"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-prelude"),
              version = "1.0.0-RC9",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-prelude-macros"),
                    version = "1.0.0-RC9"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "2.0.0-RC1"
                  )
                )
            )
          ),
        blockers = HashSet(),
        dependants = Set(),
        zioDep =
          Some(value =
            ZioDep(
              zioDep =
                VersionedProject(
                  project = Project(group = "dev.zio", artifactId = "zio"),
                  version = "1.0.12"
                ),
              dependencyType = Direct
            )
          )
      ),
      ConnectedProjectData(
        project = Project(group = "dev.zio", artifactId = "zio-zmx"),
        version = Version(value = "0.0.11"),
        dependencies =
          HashSet(
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-test"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "io.d11", artifactId = "zhttp"),
              version = "1.0.0.0-RC19",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "1.0.13"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.13"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "1.0.13"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.13"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio"),
              version = "2.0.0-RC1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-stacktracer"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "izumi-reflect"),
                    version = "2.0.8"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-internal-macros"),
                    version = "2.0.0-RC1"
                  )
                )
            ),
            ProjectMetaData(
              project = Project(group = "dev.zio", artifactId = "zio-json"),
              version = "0.3.0-RC1-1",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "2.0.0-RC1"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "2.0.0-RC1"
                  )
                )
            )
          ),
        blockers =
          HashSet(
            ProjectMetaData(
              project = Project(group = "io.d11", artifactId = "zhttp"),
              version = "1.0.0.0-RC19",
              dependencies =
                HashSet(
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-streams"),
                    version = "1.0.13"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test"),
                    version = "1.0.13"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio"),
                    version = "1.0.13"
                  ),
                  VersionedProject(
                    project = Project(group = "dev.zio", artifactId = "zio-test-sbt"),
                    version = "1.0.13"
                  )
                )
            )
          ),
        dependants = Set(),
        zioDep =
          Some(value =
            ZioDep(
              zioDep =
                VersionedProject(
                  project = Project(group = "dev.zio", artifactId = "zio"),
                  version = "1.0.12"
                ),
              dependencyType = Direct
            )
          )
      )
    )
end JsDataConnected
