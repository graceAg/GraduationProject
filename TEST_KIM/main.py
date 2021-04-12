import librosa
import ffmpeg

audio_path = 'testdata1.mp3'

w, sr = librosa.load(audio_path)
#print("됨")