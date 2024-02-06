import androidx.compose.runtime.Composable

@Composable
fun printASCII() {
    val img1 = """
                  ,*-.
                  |  |
                  |  |
            ,.    |  |
            | |___|  |   ,.
            `-----.  |___| |
                  |  .----`
                  |  |
                  |  |
                  |  |
                  |  |
                  """.trimIndent()

    val img2 = """
      ___           ___       ___           ___           ___           ___           ___                 
     /\  \         /\__\     /\  \         /\  \         /\  \         /\__\         /\  \          ___   
    /::\  \       /:/  /    /::\  \       /::\  \       /::\  \       /::|  |       /::\  \        /\  \  
   /:/\:\  \     /:/  /    /:/\:\  \     /:/\:\  \     /:/\:\  \     /:|:|  |      /:/\:\  \       \:\  \ 
  /:/  \:\  \   /:/  /    /::\~\:\  \   /::\~\:\  \   /:/  \:\  \   /:/|:|  |__   /::\~\:\  \      /::\__\
 /:/__/ \:\__\ /:/__/    /:/\:\ \:\__\ /:/\:\ \:\__\ /:/__/ \:\__\ /:/ |:| /\__\ /:/\:\ \:\__\  __/:/\/__/
 \:\  \ /:/  / \:\  \    \/_|::\/:/  / \/__\:\/:/  / \:\  \  \/__/ \/__|:|/:/  / \/__\:\/:/  / /\/:/  /   
  \:\  /:/  /   \:\  \      |:|::/  /       \::/  /   \:\  \           |:/:/  /       \::/  /  \::/__/    
   \:\/:/  /     \:\  \     |:|\/__/        /:/  /     \:\  \          |::/  /        /:/  /    \:\__\    
    \::/  /       \:\__\    |:|  |         /:/  /       \:\__\         /:/  /        /:/  /      \/__/    
     \/__/         \/__/     \|__|         \/__/         \/__/         \/__/         \/__/                
        """.trimIndent()

    // Split both ASCII art strings into lines
    val lines1 = img1.lines()
    val lines2 = img2.lines()

    // Determine the maximum line length for both images
    val maxLineLength1 = lines1.maxOfOrNull { it.length } ?: 0
    val maxLineLength2 = lines2.maxOfOrNull { it.length } ?: 0

    // Pad shorter lines with spaces to match the length of the longest line
    val paddedLines1 = lines1.map { it.padEnd(maxLineLength1) }
    val paddedLines2 = lines2.map { it.padEnd(maxLineLength2) }

    // Print both ASCII art strings line by line
    for (i in paddedLines1.indices) {
        println("${paddedLines1[i]}    ${paddedLines2[i]}")
    }
}
