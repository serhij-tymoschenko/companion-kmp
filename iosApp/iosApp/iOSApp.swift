import SwiftUI
import Shared

@main
struct iOSApp: App {
    init() {
        KoinConfigIosKt.doInitKoinIos()
    }

    var body: some Scene {
        WindowGroup {
            ContentView()
        }
    }
}