package fileWrite

import "testing"

func TestFileWrite(t *testing.T) {
	result := Hello("Taro")
	want := "Hi, Taro. Welcome!"
	if result != want {
		t.Errorf("fileWrite.Hello() = %q want %q", result, want)
	}
}
