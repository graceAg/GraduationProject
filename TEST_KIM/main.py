#%%
import librosa
import matplotlib.pyplot as plt
import IPython.display

audio_path = 'testdata1.wav'

w, sr = librosa.load(audio_path)

print(plt.plot(audio_path[0:10]))

#%%
IPython.display.Audio('bensound-theelevatorbossanova.mp3')

#출처: https://banana-media-lab.tistory.com/entry/Librosa-python-library로-음성파일-분석하기 [Banana Media Lab]


# %%
