package eu.kanade.tachiyomi.extension.all.hiirbaf

import eu.kanade.tachiyomi.source.Source
import eu.kanade.tachiyomi.source.SourceFactory

class CubariFactory : SourceFactory {
    override fun createSources(): List<Source> = listOf(
        Hiirbaf("en"),
        Hiirbaf("all"),
        Hiirbaf("other"),
    )
}
